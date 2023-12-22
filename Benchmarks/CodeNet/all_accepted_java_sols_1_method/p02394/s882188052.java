/**
 * Created by kaki on 2017/04/17.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int W = Integer.parseInt(scan.next());
        int H = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        int r = Integer.parseInt(scan.next());
        if (x + r > W || y + r > H || x - r < 0 || y - r < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}