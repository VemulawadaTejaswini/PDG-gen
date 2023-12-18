import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] f = new int[n];
		for(int i =  0; i < n; i++) {
			f[i] = 0;
		}
		
		int a, b;
		for(int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			f[a-1]++;
			f[b-1]++;
		}
		
		for(int x : f) {
			System.out.println(x);
		}

	}

}
