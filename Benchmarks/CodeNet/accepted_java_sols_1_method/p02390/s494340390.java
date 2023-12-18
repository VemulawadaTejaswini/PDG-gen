/**
 * Created by kaki on 2017/04/17.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int S = Integer.parseInt(scan.next());
        int m = 0;
        int h = 0;
        while (S > 59) {
            S -= 60;
            m += 1;
        }
        while (m > 59) {
            m -= 60;
            h += 1;
        }
        System.out.println(h + ":" + m + ":" + S);
    }
}