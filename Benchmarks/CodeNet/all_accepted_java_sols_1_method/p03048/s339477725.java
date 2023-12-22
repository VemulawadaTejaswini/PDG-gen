
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= N / R; ++i) {
            for (int j = 0; j <= (N - i * R) / G; ++j) {
                int remain = N - i * R - j * G;
                if (remain % B == 0) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}
