import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int R = scan.nextInt();
        int G = scan.nextInt();
        int B = scan.nextInt();
        int N = scan.nextInt();
        int answer = 0;
        int max_r = N / R;
        int max_g = N / G;
        int max_b = N / B;
        for (int r = 0; r <= max_r; r++) {
            for (int g = 0; g <= max_g; g++) {
                if (N < r * R + g * G) {
                    continue;
                }
                int remain = N - r * R - g * G;
                if (remain % B != 0) {
                    continue;
                }
                if (remain / B <= max_b) {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
