import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), l = in.nextInt(), r = in.nextInt();
        while (n != 0) {
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            a[n] = 1;

            int cnt = 0;
            for (int i = l; i <= r; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i % a[j] == 0) {
                        if (j % 2 == 0) cnt++;
                        break;
                    }
                }
            }
            out.println(cnt);


            n = in.nextInt();
            l = in.nextInt();
            r = in.nextInt();
        }
        out.flush();
    }
}

