import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        while (n > 0) {
            long[] a = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i] = in.nextInt();
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] * n <= sum) cnt++;
            }
            out.println(cnt);


            n = in.nextInt();

        }
        out.flush();
    }

}

