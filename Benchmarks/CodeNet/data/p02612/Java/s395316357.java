import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int count = 0;
        while(N > 1000*count){
            count ++;
        }
        int ans = 1000*count - N;
        System.out.println(ans);
    }
}