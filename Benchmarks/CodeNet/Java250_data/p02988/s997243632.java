import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];
    static int p[] = new int[20];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int cnt=0;
        for (int i=0;i<n;i++) {
            p[i] = sc.nextInt();
        }
        for (int i=1;i<n-1;i++) {
            if (p[i-1] < p[i] && p[i] < p[i+1]) cnt++;
            else if (p[i+1]<p[i]&&p[i]<p[i-1]) cnt++;
        }
        out.println(cnt);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
