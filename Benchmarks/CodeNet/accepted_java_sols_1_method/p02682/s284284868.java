import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int point = 0;
        int diff;

        if (A >= K) {
            point = K;
        } else if ((A + B) >= K) {
            point = A;
        } else {
            diff = K - (A + B);
            point = A - diff;
        }

        System.out.print(point);
    }
}