import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //入力した数値を格納
        int L, R, d;
      //倍数の数を格納
        int countflag = 0;
        Scanner scanner = new Scanner(System.in);

        L = scanner.nextInt();
        R = scanner.nextInt();
        d = scanner.nextInt();

		//L以上R以下の整数でdの倍数の個数をカウント
        for(int i = L; i <= R; i++) {
            if(i % d == 0) {
                countflag++;
            }
        }
	//結果を出力
        System.out.println(countflag);
	//スキャナーの解放
        scanner.close();
    }
}