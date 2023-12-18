import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(d);
        out.println(d[d.length/2] - d[(d.length/2)-1]);
        
        out.flush();
    }
}