import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int next = 1;
		for(int i = 0; i < n; i++) {
			if(a[i] == next) {
				next++;
			}
			else {
				count++;
			}
			
		}
		if(count==a.length) {
			System.out.println(-1);
		}
		else {
			System.out.println(count);
		}
	}
}