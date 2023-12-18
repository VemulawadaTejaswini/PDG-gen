import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n = sc.nextInt();

        StringBuilder b = new StringBuilder("");
        if (n == 0)
            b.append(0);
        while (n != 0) {
            int rem = n % -2;
            n /= -2;
            if (rem < 0) {
                rem += 2;
                n++;
            }
            b.append(rem);
        }

        w.println(b.reverse().toString());
        w.close();
    }
}
