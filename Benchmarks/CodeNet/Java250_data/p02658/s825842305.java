import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //入力
      	int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
 		//0を見つけたいので昇順にソート
        Arrays.sort(a);
 		//10の18乗
        final long K = (long) Math.pow(10, 18);
 		//0があるとき
        if (a[0] == 0) {
            System.out.println(0);
            return;
        }
 
        long result = 1;
      	//取り出した値を格納する変数:順に取り出したい配列
        for (long l : a) {
            if (result > K / l) {
                System.out.println(-1);
                return;
            }
          //取り出した値を掛ける
            result *= l;
        }
        System.out.println(result);
 
    }
}