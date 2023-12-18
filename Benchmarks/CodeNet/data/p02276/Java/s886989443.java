import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++){
			A[i] = sc.nextInt();
		}
		int q = partition(A, 0, n - 1);
		for (int i = 0; i < n; i++){
			if (i == q) {
				System.out.print("[" + A[i] + "]");
			}
			else {
				System.out.print(A[i]);
			}
			if (i != A.length - 1) {
				System.out.print(" ");
			}
			else {
				System.out.println();
			}
		}
	}

	public static int partition(int[] A, int p, int r){
		int x = A[r];
		int i = p - 1;
		for (int j = p; j < r; j++){
			if (A[j] <= x){
				i++;
				int m = A[i];
				A[i] = A[j];
				A[j] = m;
			}
		}
		int m = A[i + 1];
		A[i + 1] = A[r];
		A[r] = m;
		return i + 1;
	}

}

