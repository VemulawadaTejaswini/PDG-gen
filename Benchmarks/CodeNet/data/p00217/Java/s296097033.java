import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static class C implements Comparable<C>{
		int num;
		int length;
		
		C(int num, int a, int b) {
			this.num = num;
			this.length = a + b;
		}

		public int compareTo(C o) {
			return o.length - this.length;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		C c[];
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			c = new C[n];
			for (int i = 0; i < n; i++) {
				c[i] = new C(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(c);
			System.out.println(c[0].num + " " + c[0].length);
		}
	}
}