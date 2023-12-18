import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        //素数を真偽判定する
        boolean result;

        for(long i = X; i < 100010 ; i++){
            //素数であると仮定して初期化
            result = true;
            for(long j = 2; j < i; j++){
                if(i % j == 0){
                    //約数を持つ場合素数でない
                    result = false;
                    sc.close();
                    break;
                }
            }
            //結果が真であるなら素数としてカウント
            if(result && i >= X){
            	sc.close();
            	System.out.println(i);
            	break;
            }
        }
    }
}