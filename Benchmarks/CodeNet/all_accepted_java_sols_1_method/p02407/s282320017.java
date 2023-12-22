import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			if(i!=n-1) {
				System.out.print(" " + a[i]);
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.println();
		scanner.close();
	}
}
