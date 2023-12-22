import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            System.out.println((N % 10 == 7 || ((N / 10) % 10) == 7 || ((N / 100) % 10) == 7) ? "Yes" : "No");
        }
    }
}
