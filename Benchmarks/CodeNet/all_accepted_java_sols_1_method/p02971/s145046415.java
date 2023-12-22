import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int first = 0;
		int second  = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(first < a[i]) {
				second = first;
				first = a[i];
			}
			else if(second < a[i]) {
				second = a[i];
			}
		}
		for(int i =0 ;i < n; i++) {
			if(a[i] == first) {
				System.out.println(second);
			}
			else {
				System.out.println(first);
			}
		}
	}
}
