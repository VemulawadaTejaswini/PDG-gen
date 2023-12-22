import java.util.*;

import javax.swing.plaf.basic.BasicSliderUI.ScrollListener;

public class Main {
    static public void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        long n = Long.parseLong(temp);
        temp = sc.next();
        long k = Long.parseLong(temp);

        long temp2 = n % k;
        if (temp2 > k / 2) {
            temp2 = k - temp2;
        }
        System.out.println(temp2);
    }
}