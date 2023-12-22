import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat fmt = new DecimalFormat("0.########");
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        final int n = Integer.parseInt(sc.next());
        final int x[] = new int[n];
        for(int i = 0; i<n; i++)
            x[i] = Integer.parseInt(sc.next());
        int d1 = 0, d2 = 0, di = 0;
        long d3 = 0;
        for(int i = 0; i<n; i++){
            final int y = Math.abs(Integer.parseInt(sc.next())-x[i]);
            d1 += y;
            d2 += y*y;
            d3 += y*y*y;
            di = Math.max(di, y);
        }
        out.println(d1);
        out.println(fmt.format(Math.sqrt(d2)));
        out.println(fmt.format(Math.pow(d3, 1.0/3.0)));
        out.println(di);
        out.flush();
    }
}