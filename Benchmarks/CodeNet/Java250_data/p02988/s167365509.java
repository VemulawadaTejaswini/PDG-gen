import java.util.*;
public class Main {
  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int ret = test(n, array);
		System.out.println(ret);
		sc.close();
	}
	static int test(int n, int[] array) {
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			int p1 = array[i];
			int p2 = array[i + 1];
			int p3 = array[i + 2];
			if ((p1 >= p2 && p2 > p3) || (p3 >= p2 && p2 > p1)) {
				count++;
			}
		}
		return count;
	}
}