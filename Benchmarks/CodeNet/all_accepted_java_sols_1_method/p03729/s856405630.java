import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String A = in.next();
            String B = in.next();
            String C = in.next();

            System.out.println(A.charAt(A.length() - 1) == B.charAt(0) && B.charAt(B.length() - 1) == C.charAt(0) ? "YES" : "NO");
        }
    }
}
