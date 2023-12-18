
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n-1; i++) {
			int k = sc.nextInt();
			a[k]++;
		}
		for(int i = 1; i < n; i++) {
			System.out.println(a[i]);
		}
		System.out.println(0);
		
	}
	
}
