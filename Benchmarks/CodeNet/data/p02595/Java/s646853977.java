import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();

        int result = (int) Math.pow(D, 2);
        int overCount = 0;

        for (int i = N; i > 0; i--) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if (result >= (int) Math.pow(X, 2) + (int) Math.pow(Y, 2)) {
                overCount++;
            }
        }

        System.out.println(overCount);
    }
}