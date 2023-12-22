import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int T = sc.nextInt();
            System.out.println(((N / X) + (N % X == 0 ? 0 : 1)) * T);
        }
    }
}
