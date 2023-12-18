import java.util.Scanner;

// ALDS1_4_B
public class Main {
	boolean binarySearch(int[] array, int target, int min, int max) {
		if (max < min) return false;
		int mid = (max + min) / 2;
		if (array[mid] > target) return binarySearch(array, target, min, mid - 1);
		if (array[mid] < target) return binarySearch(array, target, mid + 1, max);
		return true;
	}
	
	void run() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			if (binarySearch(S, sc.nextInt(), 0, S.length - 1)) count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}

