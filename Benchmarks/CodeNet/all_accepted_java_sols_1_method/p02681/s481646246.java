import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            String T = sc.next();
            System.out.println(T.substring(0, T.length() - 1).equals(S) ? "Yes" : "No");
        }
    }
}
