import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = n-1; i >= 0; i--) {
			a[i] = sc.nextInt();
		}
		for(int j = 0; j < n; j++) {
			System.out.print(a[j]);
			if(j==n-1)break;
			System.out.print(" ");
		}
		System.out.println();
		
		
		sc.close();
	}
}
