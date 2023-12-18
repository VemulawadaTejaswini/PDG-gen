import java.util.Scanner;

public class Main {
	public static final int INFTY = 999999999;
	public static int hikaku = 0;  // 総比較回数

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		mergeSort(S, 0, n);
		System.out.print(S[0]);
		for(int i = 1; i < n; i++) {
			System.out.print(" " + S[i]);
		}
		System.out.println("\n" + hikaku);
		sc.close();
	}

	// それぞれn1, n2個の整数が格納された配列LとRを配列Aにマージ（統合）する
	// LとRのすべての要素をそれらが昇順になるようにAにコピーする
	static void merge(int[] A, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for(int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for(int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}
		// LとRのそれぞれの末尾に番兵としてどの要素よりも大きな値を配置することで
		// 実装を簡略化することができる
		L[n1] = R[n2] = INFTY;
		int i = 0, j = 0;
		for(int k = left; k < right; k++) {
			hikaku++;
			if(L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			}else {
				A[k] = R[j];
				j++;
			}
		}
	}

	// 配列Aとその部分配列の範囲を表すleft,rightを引数とする
	// leftは部分配列の先頭要素のインデックス、rightは部分配列の末尾+1の要素のインデックス
	static void mergeSort(int[] A, int left, int right) {
		if(left + 1 < right) {  // 部分配列の要素数が１でないとき
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);  // merge処理の直前には、既に2つの部分配列はソート済みになっている
		}
	}
}
