import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = scan.nextInt();
		scan.close();
		long sum = 0;
		int max = a[0];
		for(int i = 1 ; i < n ; i++) {
			if(a[i] < max) sum+= (max - a[i]);
			else max = a[i];
		}
		System.out.println(sum);
	}
}
