import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            ary[i] = a;
        }
        Arrays.sort(ary);
        double d = 0.0;
        for (int i = 0; i < n - 1; i++) {
            if (d == 0) {
                d = (ary[i] + ary[i + 1]) / 2.0;
            } else {
                d = (d + ary[i + 1]) / 2.0;
            }
        }
        System.out.println(d);
    }
}