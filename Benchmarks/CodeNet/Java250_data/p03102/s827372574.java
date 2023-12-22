import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int C = scan.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = scan.nextInt();
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            int[] A = new int[M];
            for (int j = 0; j < M; j++) {
                A[j] = scan.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += A[j]*B[j];
            }
            sum += C;
            if (sum > 0) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
