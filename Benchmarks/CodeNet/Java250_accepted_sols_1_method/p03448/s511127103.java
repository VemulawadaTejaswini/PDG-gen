import java.util.*;

/*
あなたは、500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。
これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。

同じ種類の硬貨どうしは区別できません。
2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int fivehunds = s.nextInt();
        int hunds = s.nextInt();
        int fifth = s.nextInt();

        int sum = s.nextInt();

        int count = 0;
        for (int i = 0; i <= fifth; i++) {
            for (int j = 0; j <= hunds; j++) {
                for (int k = 0; k <= fivehunds; k++) {
                    int temp = i * 50 + j * 100 + k * 500;
                    if (sum == temp) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}