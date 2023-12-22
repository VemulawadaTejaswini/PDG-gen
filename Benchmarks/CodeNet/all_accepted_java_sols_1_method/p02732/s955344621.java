import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] indA = new int[n];
        long[] a = new long[2000001];
        long[] res = new long[2000001];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a[num]++;
            indA[i] = num;
        }
        long sum = 0;
        for (int i = 0; i < 2000001; i++) {
            if (a[i] > 0) {
                res[i] = a[i] * (a[i] -1) / 2;
                sum += res[i];
            }
        }
        for (int i = 0; i < n; i++) {
            //K番目がない状態（－１して）計算しなおす
            long nv = a[indA[i]] - 1;
            long nvr = 0;
            if (nv > 0) {
                nvr = nv * (nv -1) / 2;
            }
            System.out.println(sum - res[indA[i]] + nvr);
        }
    }
}
