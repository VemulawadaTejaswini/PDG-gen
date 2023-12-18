
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

class Main {

	/*
	 * 着席位置：３列目の中央
	 * 最初はソートした家同士の間隔から
	 * 大きい方から発電機の数だけ除いていたのでおかしくなっていた。
	 * そして何故か最後のテストケースの計算が行われていない…
	 */

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dataset = Integer.parseInt(br.readLine());

		for(int i=0; i<dataset; i++) {
			//家の数と発電機の数の入力
			Scanner scanner = new Scanner(br.readLine());
			int house = scanner.nextInt()
			   ,generater = scanner.nextInt();
			scanner.close();
			//家の座標の入力
			scanner = new Scanner(br.readLine());
			int houseX[] = new int[house];
			for(int j=0; j<house; j++) {
				houseX[j] = scanner.nextInt();
			}
			scanner.close();
			//家の間隔を計算
			LinkedList<Integer> interval = new LinkedList<>();
			for(int j=0; j<house-1;j++) {
				interval.add(houseX[j+1] -houseX[j]);
			}
			//ソート
			interval.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if (o1<o2) {
						return -1;
					}else if(o1>o2) {
						return 1;
					}else {
						return 0;
					}
				}
			});
			/*
			 * 家の間隔を全て足す
			 * ただし発電機が２つ以上ある場合は大きい方から
			 * 発電機の数−１個目までを除く
			 */
			int ret = 0;
			for(int j=0; j<interval.size()-(generater-1); j++) {
				ret+=interval.get(j);
			}
			System.out.println(ret);
		}

		br.close();
	}

}

