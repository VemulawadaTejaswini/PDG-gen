import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int count = 0;
            for (int n = 1; n <= N; n += 2) {
                count++;
            }
            System.out.println(count >= K ? "YES" : "NO");
        }
    }
}
