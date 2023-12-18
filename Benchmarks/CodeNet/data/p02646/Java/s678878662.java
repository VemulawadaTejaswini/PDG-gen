import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long v = sc.nextLong();

        long b = sc.nextLong();
        long w = sc.nextLong();

        long t = sc.nextLong();

        // 一秒ごとに近づく距離
        long sec_kyori = Math.abs(v - w);
        long act_kyori = Math.abs(a - b);

        boolean flg = false;
        for (int i = 0; i < t; i++) {
            long temp_a = b > a ? a + v : a - v ;
            long temp_b = b > a ? b + w : b - w;
            if (temp_a == temp_b) {
                System.out.println("YES");
                return;
            }
            b = Math.abs(a - b);
            a = 0;
        }
        if (!flg) {
            System.out.println("NO");
        }
    }
}