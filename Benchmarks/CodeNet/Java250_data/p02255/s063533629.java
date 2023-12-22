import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int a[] = new int[100];
		
		for (int i = 0; i < N; i++) {
			int val = in.nextInt();
			a[i] = val;
		}
		
		for (int i = 1; i < N; i++) {
			output(a, N);
			int val = a[i];
			int j = i-1;
			while(j >= 0 && val < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = val;
		}
		output(a, N);
	}
	
	static void output(int[] a, int N) {
		for (int i = 0; i < N-1; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(a[N-1]);
	}
}

