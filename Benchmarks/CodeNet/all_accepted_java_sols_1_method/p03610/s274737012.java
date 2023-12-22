

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s = sc.next().toCharArray();
            for (int i = 0; i < s.length; i += 2) {
                System.out.print(s[i]);
            }
            System.out.println();
        }
    }
}
