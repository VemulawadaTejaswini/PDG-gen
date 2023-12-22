import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];
    static int L[] = new int[110];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        for(int i=0;i<N;i++) L[i] = sc.nextInt();

/*        int d=0,i=0;
        while (d<=X) {
            if (i<N) d += L[i++];
            else {
                i++;
                break;
            }
        }*/
        int cnt=1,d=0;
        for (int i=1;i<=X;i++) {
            if (cnt-1<N && d+L[cnt-1] <= X) d+=L[cnt++-1];
        }
        out.println(cnt);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
