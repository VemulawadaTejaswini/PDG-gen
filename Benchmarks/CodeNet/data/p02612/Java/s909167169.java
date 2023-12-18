import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int num = N / 1000 + (N % 1000 == 0 ? 0 : 1);

        System.out.println(1000*num - N);
    }
}
