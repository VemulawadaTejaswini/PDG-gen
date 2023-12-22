import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int max = 0;
            for (int i = 1; i * i <= N; i++) {
                max = i * i;
            }

            System.out.println(max);
        }
    }
}
