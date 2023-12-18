import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int tmp = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; ++i) {
			for(int j = i+1; j < a.length; ++j) {
				if(a[i] < a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			System.out.printf("%d",a[i]);
			if(i < n-1) System.out.printf(" ");
		}
		

	}
}
