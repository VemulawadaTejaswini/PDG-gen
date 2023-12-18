import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] ary = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            ary[b - 1] = a - 1;
        }
        long[] ansAry = new long[n];
        for (int i = 0; i < q; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            ansAry[p - 1] += x;
        }
        for (int i = 1; i < n; i++) {
            ansAry[i] += ansAry[ary[i]];
        }
        for (long node : ansAry) {
            System.out.print(node + " ");
        }
    }
}