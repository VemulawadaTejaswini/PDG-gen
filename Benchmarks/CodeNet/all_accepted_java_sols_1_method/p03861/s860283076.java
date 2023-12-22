/*

基本的には　(b/x) - ((a - 1) / x)
1からbまでのxの倍数の個数　ー
1からa-1までのxの倍数の個数

a = 0のとき
a-1 = -1 となる
−１がxの倍数でなければ問題なし
→x = 1 のときますい

x = 1のとき


 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String x = sc.next();
        long anum = Long.parseLong(a);
        long bnum = Long.parseLong(b);
        long xnum = Long.parseLong(x);

        if (xnum != 1) {
            if (anum != 0) {
                System.out.println((bnum / xnum) - ((anum - 1L) / xnum));
            } else {
                System.out.println((bnum / xnum) + 1L);
            }
        } else {
            System.out.println(bnum - anum + 1L);
        }
    }
}
