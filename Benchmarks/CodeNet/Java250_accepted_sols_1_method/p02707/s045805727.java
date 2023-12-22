import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int[] a = new int[n-1];
		int[] count = new int[n];
		for(int i = 0; i < n; i++){
			count[i] = 0;
		}
		int sum = 0;
		for(int i = 0; i < n-1; i++){
			a[i] = scan.nextInt();
			count[a[i]-1]++;
		}
		for(int i = 0; i < n; i++){
			System.out.println(count[i]);
		}
	}
}
