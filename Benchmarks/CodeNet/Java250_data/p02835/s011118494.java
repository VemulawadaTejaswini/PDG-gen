import java.util.*;

/*
問題文
3 個の整数 A1,A2,A3 が与えられます。
A1+A2+A3 が 22 以上なら bust、21 以下なら win を出力してください。

制約
1≤Ai≤13
(i=1,2,3)入力中のすべての値は整数である。

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        // 問題文そのまんま
        if (a1 + a2 + a3 >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}