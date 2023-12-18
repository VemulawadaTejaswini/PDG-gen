import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j = 0, factorial, k, m;
		String str;

		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			factorial = (int) (Math.pow(2, n));
			k = sc.nextInt();
			int[] b = new int[n];
			int[] a = new int[n];
			Arrays.fill(b, 1);
			for(i = 0; i < k; i++) {
				b[sc.nextInt()] = 0;
			}
			
			for(i = 0; i < factorial; i++) {
				str = Integer.toBinaryString(i);
				for(j = 0; j < str.length(); j++) {
					a[j] = Character.getNumericValue(str.charAt(str.length() - j - 1));
				}
				boolean bool = false;
				for(j = 0; j < n; j++) {
					if(b[j] + a[j] == 2) {
						bool = true;
						break;
					}
				}
				if(bool) continue;
				System.out.print(i + ":");
				for(j = 0; j < str.length(); j++) {
					if(a[j] == 1) {
						System.out.print(" " + j);
					}
				}
				System.out.println();
			}
		}
	}
}
