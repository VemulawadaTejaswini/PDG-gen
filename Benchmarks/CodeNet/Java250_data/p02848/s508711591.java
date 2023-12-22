

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ch += N;
            if (ch > 'Z') {
                ch = (char) ('A' + (ch - 'Z') - 1);
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
