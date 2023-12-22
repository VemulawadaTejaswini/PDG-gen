import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Comparator.reverseOrder;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        int alice = 0;
        int bob = 0;
        boolean b = true;
        for (Integer tmp : a) {
            if (b) {
                alice += tmp;
            }
            else {
                bob+= tmp;
            }
            b =!b;
        }

        System.out.println(alice - bob);
    }
}