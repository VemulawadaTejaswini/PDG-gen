import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//入力値を格納
        int n = scanner.nextInt();
		//条件を満たす組み合わせをカウント
        int countflag = 0;
		//1～N回ループ
        for(int i = 1; i <= n; i++) {
          //カウントの初期化
            countflag = 0;
			//x,y,zそれぞれの組み合わせを検証する
            for(int x = 1; x <= n / 3; x++) {
                for(int y = 1; y <= n / 3; y++) {
                    for(int z = 1; z <= n / 3; z++) 
                      //条件式に合致するか判定
                        if(((x*x) + (y*y) + (z*z) + (x*y) + (y*z) + (z*x)) == i) {
                            countflag++;
                        }
                    }
                }
            }
      //結果を出力
            System.out.println(countflag);
        }
		//スキャナーの解放
        scanner.close();
        
    }
}