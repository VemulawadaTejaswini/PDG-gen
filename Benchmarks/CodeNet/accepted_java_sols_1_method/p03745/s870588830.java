import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        int count = 0;// 分けた数列の数
        for (int i = 0; i < aArr.length; i++) {
            while (i+1 < aArr.length && aArr[i] == aArr[i+1]) {
                i++;// 次の文字が現在の文字と同じならインクリメント
            }

            if (i+1 < aArr.length && aArr[i] < aArr[i+1]) {
                while (i+1 < aArr.length && aArr[i] <= aArr[i+1]) {
                    i++;
                }
            } else if (i+1 < aArr.length && aArr[i] > aArr[i+1]) {
                while (i+1 < aArr.length && aArr[i] >= aArr[i+1]) {
                    i++;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
