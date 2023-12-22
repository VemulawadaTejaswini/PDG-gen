import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            double d = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                d += 1.0 / a;
            }

            System.out.println(1.0 / d);
        }
    }

}
