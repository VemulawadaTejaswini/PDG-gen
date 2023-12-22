import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            if (N < 10) {
                System.out.println(N);
            } else if (N < 100) {
                System.out.println(9);
            } else if (N < 1000) {
                System.out.println(9 + (N - 100 + 1));
            } else if (N < 10000) {
                System.out.println(9 + 900);
            } else if (N < 100000) {
                System.out.println(9 + 900 + (N - 10000 + 1));
            } else if (N == 100000) {
                System.out.println(9 + 900 + 90000);
            }
        }
    }

}
