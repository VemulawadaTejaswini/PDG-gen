import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int A = sc.nextInt();
        // スペース区切りの整数の入力
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        //a 高橋攻撃数
        double a = (C + (B - 1))/B;
        double b = (A + (D - 1))/D;

       // (割られる数 + 割る数 – 1) / 割る数
        if (a <= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}