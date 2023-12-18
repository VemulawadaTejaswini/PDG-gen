import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        double answer = 0;
        for (int i = 1; i <= N; i++) {
            double temp = (double) 1/N;
            int score = i;
            if (K <= i) {
                answer += (double) 1/N;
                continue;
            }
            while (score < K) {
                score *= 2;
                temp *= 0.5;
            }
            answer += temp;
        }
        System.out.printf("%.12f", answer);
    }
}
