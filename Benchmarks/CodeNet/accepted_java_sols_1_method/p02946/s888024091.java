import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = in.nextInt();
        int x = in.nextInt();
        final int MIN = -1000000;
        final int MAX = 1000000;
        int right = Math.min(x + k - 1, MAX);
        for (int i = Math.max(x - k + 1, MIN); i <= right; ++i)
            out.print(i + (i == right ? "\n" : " "));
        out.close();
    }
}
