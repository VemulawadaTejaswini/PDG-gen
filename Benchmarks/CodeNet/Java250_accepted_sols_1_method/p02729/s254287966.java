import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int nSum = 0;
        int mSum = 0;
        for (int i = 0; i < n; i++)
            nSum += i;
        for (int i = 0; i < m; i++)
            mSum += i;
        pw.println(nSum + mSum);
        
        pw.flush();
    }
}