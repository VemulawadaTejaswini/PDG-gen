import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String S = sc.next();
        int[] num = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            num[i] = Integer.parseInt(S.substring(i, i+1));
        }

        String ans = "";
        for (int i = 0; i < Math.pow(2, S.length()-1); i++) {
            ans = String.valueOf(num[0]);
            int result = num[0];
            for (int j = 0; j < S.length()-1; j++) {
                if ((1 & (i >> j)) == 1) {
                    result += num[j+1];
                    ans += "+" + String.valueOf(num[j+1]);
                } else {
                    result -= num[j+1];
                    ans += "-" + String.valueOf(num[j+1]);
                }
            }
            if (result == 7) {
                ans += "=7";
                break;
            }
        }
        out.printf("%s\n", ans);
        out.flush();
    }
}