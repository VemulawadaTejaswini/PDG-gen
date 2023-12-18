import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            N %= 500;
            System.out.println(N <= A ? "Yes" : "No");
        }
    }
}
