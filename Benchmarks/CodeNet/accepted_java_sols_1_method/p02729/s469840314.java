import java.util.Scanner;

public class Main {

    static int c = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int result = 0;
        for (int i= 0; i < N; i++) {
            result += i;
        }
        for (int i= 0; i < M; i++) {
            result += i;
        }
        System.out.println(result);
    }
}