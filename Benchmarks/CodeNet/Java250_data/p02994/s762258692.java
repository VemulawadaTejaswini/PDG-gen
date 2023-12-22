import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100100;
    InputStream in = System.in;
    PrintStream out = System.out;

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int sum=0;
        for(int i=1;i<=N;i++) sum+=L+i-1;
        int diff = MAX;
        int c=0;
        for(int i=1;i<=N;i++) {
            if (Math.abs((L+i-1))<diff) {
                c=sum-(L+i-1);
                diff = Math.abs((L+i-1));
            }
        }
        out.println(c);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
