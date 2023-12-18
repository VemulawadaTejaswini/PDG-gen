import java.util.Scanner;

public class Main{
	static int H;
	static int[]A;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		A = new int[H + 1];
		for(int i = 1; i <= H; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();

		for(int i = H / 2; i >= 1; i--) {
			maxHeapify(i);
		}
		for(int i = 1; i <= H; i++) {
			System.out.print(" " + A[i]);
		}
		System.out.println();
	}
	static void maxHeapify(int i) {
		int l, r, largest;
		l = 2 * i;
		r = 2 * i + 1;

		// 左の子、自分、右の子で値が最大のノードを選ぶ
		if(l <= H && A[l] > A[i]) largest = l;
		else largest = i;
		if(r <= H && A[r] > A[largest]) largest = r;

		if(largest != i) {
			swap(A, i, largest);
			maxHeapify(largest);
		}
	}
	static void swap(int[]A, int i, int j) {
		int t = A[i];
		A[i] = A[j];
		A[j] = t;
	}
}
