import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long D = sc.nextLong();
        int count = 0;
        for (int i = 0; i < N; i++) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            double root = Math.sqrt(X*X+Y*Y);
            if (root <= D) {
                count++;
            }
        }
        System.out.println(count);
    }
}