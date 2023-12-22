import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int y = sc.nextInt();

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i + j > n) {
                        continue;
                    }
                    int k = n - (i + j);
                    int r = i * 10000 + j * 5000 + k * 1000;
                    if (y == r) {
                        System.out.println(i + " " + j + " " + k);
                        return;
                    }
                }
            }
            int dead = -1;
            System.out.println(dead + " " + dead + " " + dead);
        }
    }
}
