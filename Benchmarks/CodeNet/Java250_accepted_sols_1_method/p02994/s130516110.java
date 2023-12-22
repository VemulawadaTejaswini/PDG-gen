import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		int array[] = new int[n];
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			array[a] = a + l;
			sum += a + l;
		}
		int min = 999, j = -1;
		for (int a = 0; a < array.length; a++) {
			if (min > array[a])j = a;
			min = Math.min(min, Math.abs(array[a]));
		}
		System.out.println(sum - array[j]);
	}
}
