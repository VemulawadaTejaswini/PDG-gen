import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        String name = "";
        long n = 0;
        String[] alphabet = { "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y" };

        while (0 < N) {
            n = N % 26;
            name = alphabet[(int) (n)] + name;
            N = N / 26;
            if (n == 0) {
                N -= 1;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(name);

        sc.close();
        out.flush();
    }
}