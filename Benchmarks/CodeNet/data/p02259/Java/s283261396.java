import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int changeCount = 0;
		scanner.close();

		//降順に並べるバブルソート
		for(int i = 0; i < A.length; i++) {
			//昇順に並ぶ隣接要素が存在する時にtrue
			boolean flag = true;
			while(flag) {
				flag = false;
				for(int j = A.length - 1; j > 0; j--) {
					if(A[j - 1] > A[j]) {
						//A[j]とA{j - 1]を交換
						int tmp = A[j];
						A[j] = A[j - 1];
						A[j - 1] = tmp;
						flag = true;
						changeCount++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
		System.out.println(changeCount);
	}
}
