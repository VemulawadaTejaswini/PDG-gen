import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[5];
		int[] c = new int[5];
		int n, i, j;
		
		while (stdIn.hasNextInt()) {
			n = stdIn.nextInt();
			while (n-- > 0) {
				for (i = 0; i < 10; i++)
					a[i] = stdIn.nextInt();
				j = 0;
				for (i = 0; i < 5; i++) {
					b[i] = a[j];
					j++;
					c[i] = a[j];
					j++;
				}
				
				for (i = 1; i < 5; i++)
					if (b[i-1] > b[i]) break;
				
				for (j = 1; j < 5; j++)
					if (b[j-1] > b[j]) break;
				
				if (i == 5 && j == 5)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}

}