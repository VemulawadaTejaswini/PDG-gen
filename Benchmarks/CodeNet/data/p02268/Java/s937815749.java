import java.util.Scanner;

public class Main {
	
	static int[] s;
	static int tt;
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] t = new int[q];
		for (int i = 0; i < q; i++) {
			t[i] = sc.nextInt();
		}
		
		ans = 0;
		for (int i = 0; i < q; i++) {
			tt = t[i];
			binarySearch(0, n - 1);
		}
		System.out.println(ans);
	}
	
	private static void binarySearch(int startIndex, int endIndex) {
		int index = (startIndex + endIndex) / 2;
		if (s[index] == tt) {
			ans++;
			return;
		} else if (startIndex == endIndex) {
			return;
		} else if (s[index] > tt) {
			binarySearch(startIndex, index);
		} else if (s[index] < tt) {
			binarySearch(index + 1, endIndex);
		}
	}
}