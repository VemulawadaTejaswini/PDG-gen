import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] x = new int[N];
        long answer = 0;
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
            answer += Math.min(x[i]*2, Math.abs(K-x[i])*2);
        }
        System.out.println(answer);
    }
}
