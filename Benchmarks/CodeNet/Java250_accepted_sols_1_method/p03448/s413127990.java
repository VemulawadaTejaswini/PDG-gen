import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int X = in.nextInt();
            int count = 0;
            for (int a500 = 0; a500 <= A; a500++) {
                for (int b100 = 0; b100 <= B; b100++) {
                    for (int c50 = 0; c50 <= C; c50++) {
                        if (500 * a500 + 100 * b100 + 50 * c50 == X) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
