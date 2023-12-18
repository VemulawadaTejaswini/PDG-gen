import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = in.nextInt(), x = in.nextInt() - 1, y = in.nextInt() - 1, b[] = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = Math.min(j - i, Math.abs(i - x) + Math.abs(j - y) + 1);
                b[t]++;
            }
        for (int j = 1; j < n; j++)
            out.println(b[j]);
        out.flush();

    }
}
