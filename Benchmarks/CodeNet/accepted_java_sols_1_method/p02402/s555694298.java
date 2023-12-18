import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();

		/*long型でConstraintsの条件を記述してみました。
		 *maxに-1000000 minに1000000を設定。
		 *jがiの長さを変えるまでforループで回す。
		 *if文でmax、min内の値を入れ替える。
		 */
		long max = -1000000, min = 1000000, sum = 0;
		for(int j = 0; j < i; j++){
			long x = scan.nextLong();
			sum = sum + x;
			if(x > max){max = x;}
			if(x < min){min = x;}

		}
		/*条件を終えたらfor文を抜けmin max sumの順に表示
		 * 空白の指示が出てるので空白もはさむ。
		 */
		System.out.println(min +" "+ max +" "+sum);

    }
}