import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, i, j, factorial,k;
		String str;

		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			factorial = (int) (Math.pow(2, n));
			k = sc.nextInt();
			int[] b = new int[k];
			int[] a = new int[n];
			for(i = 0; i < k; i++) {
				b[i] = sc.nextInt();
			}
			for(i = 0; i < factorial; i++) {
				str = Integer.toBinaryString(i);

				for(j = 0; j < str.length(); j++) {
					a[j] = Character.getNumericValue(str.charAt(str.length() - j - 1));
				}
				boolean bool = false;
				for(j = 0; j < k; j++) {
					if(a[b[j]] == 0) {
						bool = true;
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
