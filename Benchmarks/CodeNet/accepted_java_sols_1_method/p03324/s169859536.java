import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt(), N = scanner.nextInt();

        if (N == 100) N++;

        for (int i = 0; i < D; i++) {
            N *= 100;
        }

        System.out.println(N);
    }
}
