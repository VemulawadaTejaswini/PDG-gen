import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //整数の個数を格納
        int N = scanner.nextInt();
	 //N個の整数を配列に格納
        int[] a = new int[N];
	 //条件を満たす整数をカウント
        int countflag = 0;

        for(int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

      //マスの番号が奇数、かつマスに書かれた整数が奇数であるかを判定
        for(int j = 1; j <= N; j++) {
            if((j % 2 == 1) && (a[j - 1] % 2 == 1)) {
                countflag++;
            }
        }

      //結果を出力
        System.out.println(countflag);
	  //スキャナーの解放
        scanner.close();
    }
}