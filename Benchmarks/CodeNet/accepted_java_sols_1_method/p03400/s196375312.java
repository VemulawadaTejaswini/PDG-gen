import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        final int D = Integer.parseInt(sc.next());
        final int X = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int chocolate = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) {
            int times = 0;
            int days = 1;
            while (days <= D) {
                chocolate++;
                times++;
                days = times * a[i] + 1;
            }
        }
        out.println(chocolate + X);
        
        out.flush();
    }

}