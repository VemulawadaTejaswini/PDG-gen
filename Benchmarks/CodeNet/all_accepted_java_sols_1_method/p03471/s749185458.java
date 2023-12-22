import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        int A = 10000;
        int B = 5000;
        int C = 1000;


        for (int ai = 0; ai <= N; ai++) {
            for (int bi = 0; bi<=N-ai; bi++) {

                int ci = N - ai - bi;
                int sum = ai * A + bi * B + ci * 1000;
                if (sum == Y) {
                    System.out.println(ai + " " + bi + " " + ci);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
