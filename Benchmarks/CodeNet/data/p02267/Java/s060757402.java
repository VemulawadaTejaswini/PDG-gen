import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++)
			s[i] = stdIn.nextInt();
		
		int q = stdIn.nextInt();
		int[] t = new int[q];
		for (int i = 0; i < q; i++)
			t[i] = stdIn.nextInt();
		
		int c = linearSearch(s, t);
		System.out.println(c);
	}
	
	public static int linearSearch(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < b.length; i++)
			for(int j = 0; j < a.length; j++)
				if (b[i] == a[j])
					count++;
		
		return count;
	}
}