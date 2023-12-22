import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//数列を入力し、逆順にして出力
		//入力する数値の個数

		//キーボード入力準備
		Scanner sc = new Scanner(System.in);

		//宣言
		ArrayList<String> array = new ArrayList<String>();

		//入力(入力する数値の個数)
		int count_num = sc.nextInt();

		//入力する数値の個数ぶんだけ繰り返す
		for(int i=0; i<count_num; i++) {
			//配列に数値を加えていく
			array.add(sc.next());
		}

		//出力
		for(int i=count_num-1; i>=0; i--) {
			System.out.print(array.get(i));
			if(i!=0) {
				System.out.print(" ");
			}else {
				System.out.println();
			}
		}
	}
}

