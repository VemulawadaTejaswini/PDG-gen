import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int bitArray[] = new int[64];
		int n = sc.nextInt();
		//int mask[][] = new int[n][64];
		List<List<Integer>> mask = new ArrayList<List<Integer>>(n);

		for(int i = 0; i < n; i++) {
			mask.add(new ArrayList<Integer>());
		}

		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				int b = sc.nextInt();
				mask.get(i).add(b);
			}
		}

		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			boolean flag = false;
			int query = sc.nextInt();
			int m = sc.nextInt();

			switch(query) {
			case 0:
				System.out.println(bitArray[m]);
				break;
			case 1:
				for(int j = 0; j < mask.get(m).size(); j++) {
					bitArray[mask.get(m).get(j)] = 1;
				}
				break;
			case 2:
				for(int j = 0; j < mask.get(m).size(); j++) {
					bitArray[mask.get(m).get(j)] = 0;
				}
				break;
			case 3:
				for(int j = 0; j < mask.get(m).size(); j++) {
					bitArray[mask.get(m).get(j)] = (bitArray[mask.get(m).get(j)] + 1) % 2;
				}
				break;
			case 4:  //all->全てのフラグがONになっている場合1、なっていない場合0を出力
				for(int j = 0; j < mask.get(m).size(); j++) {
					if(bitArray[mask.get(m).get(j)] == 0) {
						flag = true;  //1つでもオフのフラグがあればtrueにする
						break;
					}
				}
				if(flag) System.out.println(0);
				else System.out.println(1);
				break;
			case 5:  //any->何れかのフラグがONになっている場合1、なっていない場合0を出力
				for(int j = 0; j < mask.get(m).size(); j++) {
					if(bitArray[mask.get(m).get(j)] == 1) {
						flag = true;
						break;
					}
				}
				if(flag) System.out.println(1);
				else System.out.println(0);
				break;
			case 6:  //none->全てのフラグがOFFになっている場合1、なっていない場合0を出力
				for(int j = 0; j < mask.get(m).size(); j++) {
					if(bitArray[mask.get(m).get(j)] == 1) {
						flag = true;  //1つでもオフのフラグがあればtrueにする
						break;
					}
				}
				if(flag) System.out.println(0);
				else System.out.println(1);
				break;
			case 7:  //count->
				int count = 0;
				for(int j = 0; j < mask.get(m).size(); j++) {
					if(bitArray[mask.get(m).get(j)] == 1) count++;
				}
				System.out.println(count);
				break;
			case 8:  //val->
				long state = Long.MIN_VALUE;
				for(int j = 0; j < mask.get(m).size(); j++) {
					if(bitArray[mask.get(m).get(j)] == 1) {
						state += (long)Math.pow(2, mask.get(m).get(j));
					}
				}
				if(state < -1) {
					System.out.println(state + Long.MAX_VALUE + 1);
					break;
				}
				else {
					System.out.println(Long.toUnsignedString(state + Long.MAX_VALUE + 2));
					break;
				}
			}
		}
	}

}

