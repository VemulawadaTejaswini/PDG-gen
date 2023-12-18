import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int num;
	private int[] a;
	final String[] rom = {"I", "V", "X", "L", "C", "D", "M"};
	final int[] nrom = {1 , 5, 10, 50, 100, 500, 1000};

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			int n = str.length();
			
			a = new int[n];
			
			for (int i = 0; i < n; i++) {
				a[i] = number(str.substring(i, i+1));
			}
			
			for (int i = 0; i < n - 1; i++) {
				if (a[i] < a[i + 1]) {
					a[i] = a[i + 1] - a[i];
					neat(i + 1, n--);
				}
			}
			debug();
			num = 0;
			
			for (int i = 0; i < n; i++) {
				num += a[i];
			}
			
			System.out.println(num);
		}
	}
	
	private int number(String s) {
		int i = 0;
		while (true) {
			if (s.equals(rom[i])) break;
			i++;
		}
		return nrom[i];
	}
	
	private void neat(int b, int e) {
		for (int i = b + 1; i < e; i++) {
			a[i - 1] = a[i];
		}
	}
	
	private void debug() {
		System.out.println(Arrays.toString(a));
	}

}