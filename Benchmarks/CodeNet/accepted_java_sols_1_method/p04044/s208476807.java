import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);    
        int n = in.nextInt();
        int l = in.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.next();
        }
        Arrays.sort(a);
        String s = "";
        for (int i = 0; i < n; ++i) {
            s += a[i];
        }
        System.out.println(s);
    }
}
