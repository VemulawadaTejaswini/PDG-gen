import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int ret = test(array);
		System.out.println(ret);
		sc.close();
	}
	static int test(int[] array) {
		Arrays.sort(array);
		int p = array.length / 2;
		return array[p] - array[p - 1];
	}
}