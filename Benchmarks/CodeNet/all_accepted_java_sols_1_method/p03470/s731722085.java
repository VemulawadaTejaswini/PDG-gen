import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 処理対象個数の入力
		Scanner sc = new Scanner(System.in);
		int inputNumSize = sc.nextInt();
		HashMap<Integer,Integer> inputNumMap = new HashMap<>();
		for(int i=1;i <= inputNumSize;i++) {
			inputNumMap.put(sc.nextInt(), i);
		}

		sc.close();

		// 出力
		System.out.println(inputNumMap.size());

	}

}