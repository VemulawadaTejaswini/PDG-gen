import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(sc.next());
        Long[] d = new Long[n];
        Arrays.fill(d, 0L);
        long s = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (i + a < n) d[i + a]++;
            if (i - a >= 0) s += d[i - a];
        }
        out.println(s);
        out.flush();
    }
}