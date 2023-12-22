import java.util.*;
public class Main {
	public static void main(String[] args) {
		int z;
		Scanner sc = new Scanner(System.in);
		// 整数の標準入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		Integer nArray[] = new Integer[n];
		int mArray[] = new int[m];
		// nの値だけ整数の標準入力
		for(int i = 0; i < n; i++) {
			nArray[i] = sc.nextInt();
		}
		// mの値だけ整数の標準入力
		for(int j = 0; j < m; j++) {
			mArray[j] = sc.nextInt();
		}
		// ソート
		Arrays.sort(nArray, Collections.reverseOrder());
		Arrays.sort(mArray);
		// mArray配列の最小値をzに代入
		z = mArray[0];
		// 条件一致の時"No War"を出力
		if(x < z && z <= y && nArray[0] < z) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
		sc.close();
	}
}
