import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int i;
		
		for (i = 0; i < n; i++)
			a[i] =stdIn.nextInt();
		
		int count = BubbleSort(a, n);
		
		System.out.print(a[0]);
		for(i = 1; i < n; i++)
			System.out.print(" " + a[i]);
		System.out.println();
		System.out.println(count);
	}
	
	public static int BubbleSort(int[] a, int n) {
		int flag = 1, count = 0, i, t;
		while (flag != 0) {
			flag = 0;
			for (i = n - 1; i > 0; i--) {
				if (a[i] < a[i-1]) {
					t = a[i];
					a[i] = a[i-1];
					a[i-1] = t;
					count++;
					flag = 1;
				}
			}
		}
		return count;
	}
}