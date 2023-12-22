import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long k = sc.nextInt();

        long ans = 0;
        boolean flg = false;
        if (k <= a) {
            ans = k;
            flg = true;
        }

        k = k-a;

        if ( !flg && k <= b) {
            ans = a;
            flg = true;
        }

        k = k-b;

        if (!flg && k-c <= 0) {
            ans = a + (-1 * k);
        }
            System.out.println(ans);
    }
}