import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int sum = 0;

		Integer array[] = new Integer[n];
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			array[i] = (sc.nextInt());

			//総数をとっておく
			sum = sum + array[i];
		}

		//左側の和
		int tmp = 0;

		for (int j = 0; j < n - 1; j++) {
			tmp = tmp + array[j];

			//右側の和
			int right = sum - tmp;
			//差
			int diff = tmp - right;

			if(diff < 0){
				diff = diff * -1;
			}

			result.add(diff);
		}

		Collections.sort(result);

		System.out.println(result.get(0));

		sc.close();
	}
}
