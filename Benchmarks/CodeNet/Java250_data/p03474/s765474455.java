import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] s = sc.next().split("-");
        if (s.length == 2 && s[0].length() == a && s[1].length() == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}