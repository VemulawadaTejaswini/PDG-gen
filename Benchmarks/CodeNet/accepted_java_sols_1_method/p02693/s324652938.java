import java.util.*;

/*
問題文
ジャンボ高橋君はゴルフの練習をすることにしました。
ジャンボ高橋君の目標は飛距離を K の倍数にすることですが、ジャンボ高橋君の出せる飛距離の範囲は 
A 以上 B 以下です。

目標の達成が可能であれば OK と、不可能であれば NG と出力してください。

制約
入力はすべて整数
1≤A≤B≤1000
1≤K≤1000

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean flg = false;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                flg = true;
            }
        }

        if (flg) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}