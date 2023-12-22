import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int[] a = new int[N+1];
		
		for (int i = 1; i < N+1; i++) {
			a[i] = in.nextInt();
	
		}
		
		int pairs = 0;
		for (int i = 1; i < N+1; i++) {
			if (a[i]>0&&a[a[i]]==i) {
				pairs++;
				a[i] = 0;
				a[a[i]] = 0;
			}
		}
		
		System.out.println(pairs);
		
	}
}
