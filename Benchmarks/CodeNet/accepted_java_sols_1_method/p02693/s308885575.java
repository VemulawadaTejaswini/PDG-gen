import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean ans = false;
        int n = 0;

        while(n <= B){
            if(n >= A){
                ans = true;
            }
            n += K;
        }

        System.out.println(ans?"OK":"NG");
    }
}
