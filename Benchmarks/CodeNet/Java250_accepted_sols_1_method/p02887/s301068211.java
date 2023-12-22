import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        char[] s = new char[N];
        s = S.toCharArray();
        sc.close();

        char[] ans = new char[N];
        ans[0] = s[0];
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (ans[count-1] == s[i]) {
                continue;
            }
            ans[count] = s[i];
            count ++;
        }
        out.printf("%d\n", count);
        out.flush();
    }
}
