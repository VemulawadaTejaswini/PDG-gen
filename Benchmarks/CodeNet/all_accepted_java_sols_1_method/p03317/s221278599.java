import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        for (int i  = 0; i < n; ++i)
            in.nextInt();

        int ans = 0;
        int cur = 0;
        while (cur < n - 1) {
            // System.err.println(cur);
            ++ans;
            cur += k - 1;
        }

        System.out.println(ans);
    }
}