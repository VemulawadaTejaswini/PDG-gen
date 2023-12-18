import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 整数の数
		int N = scan.nextInt();

		long ans = 1;
		List<Long>  list = new ArrayList();

        // 値のリスト
		for(int i = 0; i < N; i++) {
			list.add(scan.nextLong());
		}

		// 0が含まれていたら
		if(list.contains(0)) {
			System.out.println(0);
			return;
		}

        // 掛け算の結果をansに
		for(int i = 0; i < list.size(); i++) {
			ans = ans * list.get(i);
		}

		if(ans > 1000000000000000000l) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}

	}

}