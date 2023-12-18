import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] sequence = new int[n];
		for (int i = 0; i < n; i++) {
			sequence[i] = in.nextInt();
		}
		
		int m = in.nextInt();
		int[] set_integer = new int[m];
		for (int i = 0; i < m; i++) {
			set_integer[i] = in.nextInt();
		}
		
		int res = 0;
		for (int i = 0; i < set_integer.length; i++) {
			int num = set_integer[i];
			for (int j = 0; j < sequence.length; j++) {
				if (sequence[j] == num) {
					res++;
					break;
				}
			}
		}
		System.out.println(res);
		in.close();
	}
}
