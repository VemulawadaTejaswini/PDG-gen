import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //A,B,C格納用配列
         int[] numList = new int[3];

         //入力値を配列に格納
         for (int i = 0; i < numList.length; i++) {
             numList[i] = sc.nextInt();
         }
         //取り出すカードの枚数: K
         int K = sc.nextInt();
         sc.close();

         //取り出したカードの総和
         int count = 0;
         //カードの数
         int cardNum = 1;

         for (int num : numList) {
             if (num > 0) {
                 if (num > K) {
                     num = K;
                 }
                 count += (cardNum * num);
                 K -= num;
                 if (K == 0) {
                     break;
                 }
             }
             cardNum--;
         }
         System.out.println(count);

    }

}
