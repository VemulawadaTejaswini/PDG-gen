import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        String[] ss = sc.next().split("[^ACGT]");
        if (ss.length == 0) {
            out.println("0");
        } else {
            Integer[] a = new Integer[ss.length];
            for (int i = 0; i < ss.length; i++) {
                a[i] = ss[i].length();
            }
            Arrays.sort(a, Collections.reverseOrder());
            out.println(a[0]);
        }
        
        out.flush();
    }
}