import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        int big, small;
        if (a[0] == a[1]) {
            System.out.println(a[0]);
            return;
        } else if (a[0] > a[1]) {
            big = a[0];
            small = a[1];
        } else {
            big = a[1];
            small = a[0];
        }

        while (true) {
            int x = big % small;
            if (x == 0) {
                System.out.println(small);
                return;
            } else {
                big = small;
                small = x;
            }
        }
    }
}