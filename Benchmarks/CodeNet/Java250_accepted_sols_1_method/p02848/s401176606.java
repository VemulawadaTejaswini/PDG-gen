

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n = sc.nextInt();
        String s = sc.next();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = str.indexOf(c) + n;
            if (str.length() <= idx) {
                idx -= str.length();
            }
            ans += str.charAt(idx);
        }
        System.out.println(ans);

        sc.close();
    }
}