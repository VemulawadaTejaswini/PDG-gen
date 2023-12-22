import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] a = new int[N + 1];
		
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x]++;
			a[y]++;
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.println(a[i]);
		}
		
	}
}
