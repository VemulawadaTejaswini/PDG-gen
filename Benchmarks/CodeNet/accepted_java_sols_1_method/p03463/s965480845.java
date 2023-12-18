import java.util.Scanner;

/**
 * Created by hkoba on 2018/01/08.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // スペース区切りの整数の入力
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 奇数ならBorysの勝ち、偶数ならAliceの勝ち
        if ((b - a) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}
