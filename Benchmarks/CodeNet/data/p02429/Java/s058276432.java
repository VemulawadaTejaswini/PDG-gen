import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int bitArray[] = new int[n];

		int k = sc.nextInt();
		int mask[] = new int[k];
		for(int i = 0; i < k; i++) {
			mask[i] = sc.nextInt();
		}

		for(int i = 0; i < Math.pow(2, k); i++) {  //maskがkの大きさなら2^kの大きさのビット列を作り、順列を求める
			int bitArray[] = new int[n];
			int temp = i;
			int index = 0;  //実際に表示されるindexはビットが1の値のjに対して2^mask[j]を足していったもの
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) {
					bitArray[mask[j]] = 1;
					index += Math.pow(2, mask[j]);
				}
				temp /= 2;
			}

			//////////////////////////////////////////////////////////

			System.out.print(index + ":");  //順列のインデックス
			for(int j = 0; j < k; j++) {
				if(bitArray[mask[j]] == 1) System.out.print(" " + mask[j]);
			}
			System.out.println();
		}
	}

}

