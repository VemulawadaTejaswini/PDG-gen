import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int tmp = N - K;
        if (K == 1){
            tmp = 0;
        }

        System.out.println(tmp);
    }
}