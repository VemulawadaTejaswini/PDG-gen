
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d[] = new int[N];
        int health = 0;
        for (int i = 0; i < N; i++) {
            d[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) health += d[i] * d[j];
            }
        }

        System.out.println(health / 2);
    }
}