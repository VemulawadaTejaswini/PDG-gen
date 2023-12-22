

import java.util.Arrays;
import java.util.Scanner;

/*
絶対値の和の最小
|x−B1|+|x−B2|+⋯+|x−BN| を最小にする x は、B1,B2,…,BN のメディアン *式変形
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[(int)N];
        int[] b = new int[(int)N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i] - i;
        }
        Arrays.sort(b);
        int mid = b[N/2];
        long min = 0;
        for(int i = 0; i < N; i++) {
            min += Math.max(mid - b[i], - mid + b[i]);
        }
        System.out.println(min);

    }
}
