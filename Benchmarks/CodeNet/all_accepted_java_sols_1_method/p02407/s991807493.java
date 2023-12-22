import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n, i;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int a[] = new int[n];
		
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		for(i = n-1; i >= 0; i--) {
			System.out.print(a[i]);
			if(i > 0) System.out.print(" ");
		}
		System.out.println();
		
	}

}
