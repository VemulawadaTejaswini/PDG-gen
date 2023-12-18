import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * 値の格納
         * AとBの大小比較
         * 小さいほうにfalseを代入
         * trueの数を数える
         * */

        int numOfTenboudai = sc.nextInt();
        int numOfMichi = sc.nextInt();
        boolean[] isHighest = new boolean[numOfTenboudai];
        for (int i = 0; i < numOfTenboudai; i++) {
            isHighest[i] = true;
        }

        int[] hightOfTenboudai = new int[numOfTenboudai];
        for (int i = 0; i < numOfTenboudai; i++) {
            hightOfTenboudai[i] = sc.nextInt();
        }

        int A = 0;
        int B = 0;
        for (int i = 0; i < numOfMichi; i++) {
            A = sc.nextInt()-1;
            B = sc.nextInt()-1;
            if (hightOfTenboudai[A] > hightOfTenboudai[B]) {
                isHighest[B] = false;
            } else if (hightOfTenboudai[A] < hightOfTenboudai[B]) {
                isHighest[A] = false;
            } else {
                isHighest[A] = false;
                isHighest[B] = false;
            }
        }

        int ans = 0;

        for (int i = 0; i < numOfTenboudai; i++) {
            if (isHighest[i]) {
                ans++;
            }
        }

        System.out.println(ans);


    }
}
