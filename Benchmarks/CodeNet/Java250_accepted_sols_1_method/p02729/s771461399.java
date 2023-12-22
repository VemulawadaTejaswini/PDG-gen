import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //奇数２つパターン
        //偶数２つパターン
        int np = 0;
        int mp = 0;
        if (n > 1) {
            np = n*(n-1)/2;
        }
        if (m > 1) {
            mp = m*(m-1)/2;
        }
        System.out.println(np+mp);
    }
}