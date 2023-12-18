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
        long kyori = v - w;

//        // 偶奇が異なれば逃げ切れる
//        if (((a+v) % 2) != ((b+w) % 2)) {
//            System.out.println("NO");
//            return;
//        }
//
//        // 実際の移動回数
//        long idokaisu = Math.abs(v-w);
//        if (v == w) {
//        	idokaisu = v;
//        }
        boolean flg = false;
        for (int i = 0; i < t; i++) {
            long temp_a = b > a ? a + v : a - v ;
            long temp_b = b > a ? b + w : b - w;
            if (temp_a == temp_b) {
                System.out.println("YES");
                flg = true;
                return;
            }
            a =temp_a;
            b = temp_b;
        }
        if (!flg) {
            System.out.println("NO");
        }
    }
}