import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] sArray = new int[10001];
		int[] qArray = new int[501];
		int count = 0;

		// 入力を受け取る
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			sArray[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			qArray[i] = scan.nextInt();
		}

		// 線形探索を行う
		for(int i = 0; i < q; i++) {
			// 番兵の設置
			sArray[num] = qArray[i];
			int j = 0;
			while(sArray[j] != qArray[i]) {
				j++;
			}
			if(j == num) {
				continue;
			}
			count++;
		}

		System.out.println(count);

	}
}

