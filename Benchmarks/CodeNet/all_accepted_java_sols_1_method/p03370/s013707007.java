import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] m = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = scan.nextInt();
		}
		int min = 2000;
		for (int i = 0; i < n; i++) {
			if (m[i] < min) {
				min = m[i];
			}
		}
		int num = 0;
		for (int i = 0; i < n; i++) {
			x -= m[i];
		}
		num += n;
		while (x-min >= 0) {
			x -= min;
			num++;
		}
		System.out.println(num);
	}
}