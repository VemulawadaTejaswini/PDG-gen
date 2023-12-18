import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];
		int[] reverse = new int[100];
		int count = 1;
		int n = sc.nextInt();
		for (int i=0; i < n; i++) {
			int a = sc.nextInt();
			array[i] = a;
		}
		sc.close();
		for (int len = n-1, i=0; i < n; i++, len--)
			reverse[len] = array[i];
		System.out.println(n);
		for (int i: reverse) {
			if (count == n) {
				System.out.print(i);
				break;
			} else {
				System.out.print(i + " ");
			}
			count++;
		}
	}
}