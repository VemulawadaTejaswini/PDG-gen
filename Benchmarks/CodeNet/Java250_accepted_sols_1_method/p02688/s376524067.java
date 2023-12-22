
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] visited = new int[n + 1];
        for (int i = 0; i < k; ++i) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; ++j) {
                int people = scanner.nextInt();
                visited[people] = 1;
            }
        }
        int number = n;
        for (int i = 1; i <= n; ++i) {
            if (visited[i] == 1) {
                number--;
            }
        }
        System.out.println(number);
    }
}
