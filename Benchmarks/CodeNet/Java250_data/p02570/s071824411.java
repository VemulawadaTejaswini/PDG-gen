import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int D = sc.nextInt();
            int T = sc.nextInt();
            int S = sc.nextInt();
            System.out.println(D - T * S <= 0 ? "Yes" : "No");
        }
    }
}
