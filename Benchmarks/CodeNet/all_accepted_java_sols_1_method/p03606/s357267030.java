import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0;
		int[] l = new int[n];
		int[] r = new int[n];
		int count = 0;
		for(i = 0; i < n; i++) {
			l[i] = scan.nextInt();
			r[i] = scan.nextInt();
			count = count + (r[i] - l[i] + 1);
		}
		System.out.println(count);
	}
}