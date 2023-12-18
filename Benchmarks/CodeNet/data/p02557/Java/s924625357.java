import java.math.BigInteger;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i ++)
			a[i] = in.nextInt();
		for(int i = 0; i < n; i ++)
			b[i] = in.nextInt();
		int j = 0;
		while(j < n) {
			if(b[j] != a[0])
				break;
			j ++;
		}
		boolean ok = true;
		for(int i = 0; i < n; i ++) 
			ok &= a[i] != b[(j + i) % n];
		if(!ok) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
		for(int i = 0; i < n; i ++)
			out.append(b[(j + i) % n] + " ");
		System.out.println(out);
	}
}
