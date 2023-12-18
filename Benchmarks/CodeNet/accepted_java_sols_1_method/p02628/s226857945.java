
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//オブジェクト生成
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> minNumList = new ArrayList<Integer>();

		//代入作業
		int num1 = scan.nextInt();
		int buyCnt = scan.nextInt();
		for (int i = 0; i < num1; i++) {
			list.add(scan.nextInt());
		}

		int minNum = 0;
		int[] minNumArray = new int[buyCnt];
		for (int j = 0; j < buyCnt; j++) {
			minNum = list.get(0);
			for (int i = 1; i < num1 - j; i++) {
				if (minNum < list.get(i)) {
					//何もしない
				} else {
					minNum = list.get(i);
				}
			}
			minNumArray[j] = minNum;
			list.remove(list.indexOf(minNum));
		}

		int ans = 0;
		for (int i = 0; i < minNumArray.length; i++) {
			ans += minNumArray[i];
		}

		System.out.println(ans);

	}

}
