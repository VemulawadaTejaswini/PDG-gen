import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int[] B = new int[M];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum += Integer.parseInt(sc.next()) * B[j];
            }
            if (sum + C > 0) {
                count++;
            }
            sum = 0;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        sc.close();
        out.flush();
    }
}