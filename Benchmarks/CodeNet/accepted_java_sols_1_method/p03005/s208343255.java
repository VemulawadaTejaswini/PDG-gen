import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = 0;
        if (K != 1) {
            result = N - K;
        }

        System.out.println(result);
    }

}
