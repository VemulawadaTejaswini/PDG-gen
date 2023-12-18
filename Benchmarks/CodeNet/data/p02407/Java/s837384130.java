import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[n - i - 1] = Integer.parseInt(sc.next());
        }

        int count = 0;
        String ans = "";
        for (int val : list) {
            if (count != 0) {
                ans += " ";
            }
            ans += String.valueOf(val);
            count++;
        }
        out.printf("%s\n", ans);
        out.flush();
    }
}
