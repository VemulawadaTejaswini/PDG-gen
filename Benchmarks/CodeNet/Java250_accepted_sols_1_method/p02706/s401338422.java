import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int study = 0;

        for (int i = 0; i < M; i++) {
            study += scanner.nextInt();
        }
        scanner.close();

        System.out.println(N >= study ? N - study : -1);

    }
}