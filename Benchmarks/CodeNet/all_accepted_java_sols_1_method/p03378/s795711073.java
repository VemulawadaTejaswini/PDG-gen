import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int x = cin.nextInt();
        int [] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = cin.nextInt();
        }
        if (x == n) {
            System.out.println(0);
            return;
        }

        long left = Arrays.stream(a).filter(ai -> { return (ai < x); }).count();
        long right = Arrays.stream(a).filter(ai -> { return (ai > x); }).count();

        System.out.println(Math.min(left, right));
    }
}
