import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());

        int alice = 0;
        int bob = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                bob += a[i];
            } else {
                alice += a[i];
            }
        }

        System.out.print(alice - bob);
    }
}