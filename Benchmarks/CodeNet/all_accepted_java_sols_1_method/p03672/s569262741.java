

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] c = sc.next().toCharArray();
        for (int i = 1; i < c.length; i++) {
            if ((c.length - i) % 2 != 0) {
                continue;
            }
            int mid = (c.length - i) / 2;
            String first = Arrays.toString(Arrays.copyOfRange(c, 0, mid));
            String second = Arrays.toString(Arrays.copyOfRange(c, mid, c.length - i));
            if (first.equals(second)) {
                System.out.println(c.length - i);
                return;
            }
        }
    }
}
