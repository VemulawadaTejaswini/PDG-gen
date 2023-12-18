

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int ans = 0;
            for (char ch : s.toCharArray()) {
                ans += ch == '+' ? 1 : -1;
            }
            System.out.println(ans);
        }
    }
}
