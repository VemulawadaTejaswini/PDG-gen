

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] c = sc.next().toCharArray();
        String ACGT = "ACGT";
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (ACGT.indexOf(c[i]) >= 0) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        System.out.println(ans);
    }
}
