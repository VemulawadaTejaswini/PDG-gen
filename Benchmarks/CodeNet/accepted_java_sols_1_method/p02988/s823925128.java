import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int c;
		int d;
		int e;
		int f;
		int count = 0;
		for(int i = 0; a>i; i++) {
			c = sc.nextInt();
			b[i] = c;
		}

		for(int i = 1; a-1 > i ; i++) {
			d = b[i-1];
			e = b[i];
			f = b[i+1];
			if((e > d || e > f) && (e < d || e < f)) {
				count++;
			}
		}
		System.out.println(count);
	}
}