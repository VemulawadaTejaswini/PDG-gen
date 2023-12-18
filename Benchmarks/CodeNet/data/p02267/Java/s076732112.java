import java.util.Scanner;

class Main { 	//2つの配列の中から同じものの個数を数える。



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array1 = new int[n];	//1つ目の配列
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] array2 = new int[m];	//2つ目の配列
		for (int j = 0; j < m; j++) {
			array2[j] = sc.nextInt();
		}
		System.out.println(calc(array2, array1, m, n));
	}
	public static int calc(int[] a, int[] b ,int n, int m) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean d = true;
				for (int j = 0; j < m; j++) {
					if(d)
					if (a[i] == b[j]) {
						count++;
						d = false;
					}
				}
		}
		return count;
	}
}
