import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = Long.parseLong(sc.next());
            String ans = "";
            do {
                ans = (char)('a' + (N % 26) - 1) + ans;
                N /= 26;
            } while (N > 0);
            System.out.println(ans);
        }
    }
}