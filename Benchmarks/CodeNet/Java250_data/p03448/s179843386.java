import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());
        scanner.close();

        int count = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    int sum = i * 500 + j * 100 + k * 50;
                    if (sum == X) count++;
                }
            }
        }

        System.out.println(count);
    }
}
