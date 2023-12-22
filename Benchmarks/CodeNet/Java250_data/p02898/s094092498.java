import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int count = 0;
		
       //配列を使用して身長を比べる
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(scanner.nextInt());
		}

		for (int i = 0; i < N; i++) {
          if (list.get(i) >= K) {
				count++;
			}
		}
		System.out.println(count);
	}
}