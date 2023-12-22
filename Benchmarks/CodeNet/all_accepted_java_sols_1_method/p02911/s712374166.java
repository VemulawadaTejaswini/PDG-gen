import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int Q = scanner.nextInt();

        if (K > Q) {
            for (int i=0; i<N; i++) {
                System.out.println("Yes");
            }
            return;
        }

        int[] result = new int[N];
        for (int i=0; i<N; i++) {
            result[i] = K - Q;
        }

        for (int i=0; i<Q; i++) {
            result[scanner.nextInt()-1]++;
        }

        for (int i=0; i<N; i++) {
            System.out.println(result[i] > 0 ? "Yes" : "No");
        }
    }
}