import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sum = 0;
        String ans = "Yes";
        
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
//            pw.println(a[i]);
        }
        for (int i=0; i<n; i++)
            sum += a[i];
        
        double line = (sum * (1.0 / (4.0 * m)));
        Arrays.sort(a);

        for (int i = n-1; i >= n-m; i--) {
//            pw.print(a[i] + " ");
            if (a[i] < line)    ans = "No";
        }
//        pw.println();
//        pw.println(line);
        pw.println(ans);
        pw.flush();
    }
}