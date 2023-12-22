import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		//ドーナツの種類
		int N = scanner.nextInt();
		//お菓子の素の総量
		int X = scanner.nextInt();

		//お菓子の素m_iグラム
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int m = scanner.nextInt();
			list.add(m);

			//Xの残りを求める
			X -= m;
		}

		Collections.sort(list);
		//お菓子の素が一番必要なものを求める
		int max = list.get(N-1);

		//お菓子の素が一番必要ないものを求める
		int min = list.get(0);

		//System.out.println("max：" + max);
		//System.out.println("min：" + min);
		//System.out.println("Xの残り：" + X);

		for (int x = 0; x <= X/min; x++) {
			//System.out.println(min + "*" + x + "：" + min * x);
			//System.out.println("x：" + x);
			count = x;
			if (min * x > X) {
				break;
			}
		}
		count += N;
		System.out.println(count);
	}
}