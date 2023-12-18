/**
 * Created by kaki on 2017/04/17.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}