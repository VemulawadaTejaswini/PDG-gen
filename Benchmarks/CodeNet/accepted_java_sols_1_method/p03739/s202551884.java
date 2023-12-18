import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long cnt1 = 0;
        long add1 = 0;
        //一番目を奇数スタートにする。
        for (int i = 0; i < n; i++) {
            add1 += a[i];
            if (i % 2 == 0 && add1 <= 0) {
                cnt1 += (long) 1 - add1;
                add1 = 1;
            } else if (i % 2 == 1 && add1 >= 0) {
                cnt1 += (long) add1 + 1;
                add1 = -1;
            }
        }

        long cnt2 = 0;
        long add2 = 0;
        for (int i = 0; i < n; i++) {
            add2 += a[i];
            if (i % 2 == 1 && add2 <= 0) {
                cnt2 += (long) 1 - add2;
                add2 = 1;
            } else if (i % 2 == 0 && add2 >= 0) {
                cnt2 += (long) add2 + 1;
                add2 = -1;
            }
        }

        System.out.println(Math.min(cnt1, cnt2));

    }

}