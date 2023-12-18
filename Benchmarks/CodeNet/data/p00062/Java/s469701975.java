import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			int[] a = new int[10];
			for(int i = 0; i < 10; i++) {
				a[i] = s.charAt(i) - '0';
			}
			System.out.println(rec(a));
		}
		sc.close();
	}
	static int rec(int[] a) {
		if(a.length == 1) {
			return a[0];
		}
		int[] b = new int[a.length - 1];
		for(int i = 0; i < b.length; i++) {
			b[i] = (a[i] + a[i + 1]) % 10;
		}
		return rec(b);
	}
}

