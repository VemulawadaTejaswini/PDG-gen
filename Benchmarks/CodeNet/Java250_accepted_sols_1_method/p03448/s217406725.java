import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // \500
        int B = scanner.nextInt(); // \100
        int C = scanner.nextInt(); // \50
        int X = scanner.nextInt(); // 50*n

        int count = 0;
        for (int s=0; s <= A; s++) {
            for (int t=0; t <= B; t++) {
                for (int u=0; u <= C; u++) {
                    if (500 * s + 100 * t + 50 * u == X) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}