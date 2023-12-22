import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();  //くじ引きを行った回数
		//くじの結果が入る
		List<String> kuji = new ArrayList<String>();

		//くじを行う回数分、結果をkujiに入力する
		for(int i=0 ; i<times ; i++) {
			kuji.add(sc.next());
		}

		//重複を許さないHashSetを宣言
		//resultにkujiの要素を代入
		HashSet<String> result = new HashSet<String>(kuji);

		//.size()で要素数を返す
		System.out.print(result.size());

		sc.close();
	}
}