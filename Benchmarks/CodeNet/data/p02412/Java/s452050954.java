import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while (true) {
            int n = Integer.parseInt(sc.next())
               ,x = Integer.parseInt(sc.next());
            if (n == 0 && x == 0)   break;
            pw.println(answer(n,x));
        }
        pw.flush();
    }
    
    public static int answer(int n, int x) {
        int i, j, k, ans = 0;
        for (i = 1; i <= n; i++)
            for (j = i+1; j <= n; j++)
                for (k = j+1; k <= n; k++)
                    if (i + j + k == x) {
//                        System.out.print(i + " ");
//                        System.out.print(j + " ");
//                        System.out.println(k);
                        ++ans;
                    }
        return ans;
    }
}
