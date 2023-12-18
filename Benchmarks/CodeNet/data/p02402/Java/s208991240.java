import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		int i;
		int sum = 0;

		// nに入力された分配列を作る
		for (i = 0; i < n; i++) {

			int matrix = sc.nextInt();
			list.add(matrix);
			sum += ((Integer)list.get(i)).intValue();
		}

		int min = list.get(0);
		int max = list.get(0);

		//最小値、最大値
		for (i = 0; i < n; i++) {
			if(min > list.get(i)){
				min = list.get(i);
				if(max < list.get(i)){
					max = list.get(i);
				}

				System.out.println(min + " " + max + " " + sum);
			}
		}
	}
}

