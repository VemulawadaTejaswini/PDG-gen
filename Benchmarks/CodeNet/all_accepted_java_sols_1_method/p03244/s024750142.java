import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n / 2];
        int[] b = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int aMaxcount = 1;
        int aSecondCount = 1;
        int amaxnum = 0;
        int amaxNum2 = 0;
        int acount = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (a[i] == a[i + 1]) {
                acount++;
                if (acount > aMaxcount) {
                    aMaxcount = acount;
                    amaxnum = i;
                }

            } else {
                acount = 1;
            }
        }
        acount = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (a[i + 1] == a[amaxnum]) {
                acount = 1;
                continue;
            }
            if (a[i] == a[i + 1]) {
                acount++;
                if (acount > aSecondCount) {
                    aSecondCount = acount;
                }

            } else {
                acount = 1;
            }

        }
        if (aMaxcount == n / 2) {
            aSecondCount = 0;
        }

        int bMaxcount = 1;
        int bSecondCount = 0;
        int bmaxnum = 0;
        int bmaxNum2 = 0;
        int bcount = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (b[i] == b[i + 1]) {
                bcount++;
                if (bcount > bMaxcount) {
                    bMaxcount = bcount;
                    bmaxnum = i;
                }

            } else {
                bcount = 1;
            }
        }
        bcount = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (b[i + 1] == b[bmaxnum]) {
                bcount = 1;
                continue;
            }
            if (b[i] == b[i + 1]) {
                bcount++;
                if (bcount > bSecondCount) {
                    bSecondCount = bcount;
                }

            } else {
                bcount = 1;
            }

        }
        if (bMaxcount == n / 2) {
            bSecondCount = 0;
        }
        int ans = 0;
        int aaa = 0;
        int bbb = 0;
        if (a[amaxnum] != b[bmaxnum]) {
            ans = n - aMaxcount - bMaxcount;
        } else if (aMaxcount == n / 2 && bMaxcount == n / 2) {
            ans = n / 2;
        } else {
            aaa = n - aMaxcount - bSecondCount;
            bbb = n - aSecondCount - bMaxcount;
            ans = Math.min(aaa, bbb);
        }
        System.out.println(ans);
        //System.out.println(aMaxcount + " " + bMaxcount);
        //System.out.println(aSecondCount + " " + bSecondCount);
        //System.out.println(a[amaxnum] + " " + b[bmaxnum]);

    }
}