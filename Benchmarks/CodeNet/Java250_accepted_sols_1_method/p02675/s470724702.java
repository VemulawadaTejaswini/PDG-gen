import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt() % 10;
            System.out.println((N == 0 || N == 1 || N == 6 || N == 8) ? "pon" : (N == 3) ? "bon" : "hon");
        }
    }
}
