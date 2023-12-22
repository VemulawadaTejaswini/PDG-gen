import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < aArr.length; i++) {

            while (i+1<aArr.length && aArr[i] == aArr[i+1]) {
                // 一つ先の文字が同じだったらindexを次に進める
                i++;
            }

            if (i+1<aArr.length && aArr[i+1] > aArr[i]) {
                // 単調増加
                while (i+1<aArr.length && aArr[i+1] >= aArr[i]) {
                    // >=とすることで単調増加の数列の中での同じ数値をスキップしていく
                    i++;
                }
            } else if (i+1<aArr.length && aArr[i+1] < aArr[i]){
                // 単調減少
                while (i+1<aArr.length && aArr[i+1] <= aArr[i]) {
                    // <=とすることで単調増加の数列の中での同じ数値をスキップしていく
                    i++;
                }
            }

            res++;
        }

        System.out.println(res);
    }
}
