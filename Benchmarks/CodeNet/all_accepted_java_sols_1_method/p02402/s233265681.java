import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		int i = 0;
		long sum = 0;

		// 入力された数値を配列に入れる
		for (i = 0; i < n; i++) {
			int matrix = sc.nextInt();
			list.add(matrix);
			sum += ((Integer)list.get(i)).intValue();
		}

		int min = list.get(0);
		int max = list.get(0);

		for (i = 0; i < n; i++) {
			if(min > list.get(i)){
				min = list.get(i);
			}

			//最大値を取得
			if(max < list.get(i)){
				max = list.get(i);
	    }}

		System.out.println(min + " " + max + " " + sum);
	}
}
