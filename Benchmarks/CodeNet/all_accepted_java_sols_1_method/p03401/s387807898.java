import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int N = sc.nextInt();
		int [] a = new int[N+2];
		a[0] = 0;
		a[N+1] = 0;
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < N + 1; i++) {
			total += Math.abs(a[i] - a[i + 1]);
		}
		for (int i = 1; i < N + 1; i++) {
			System.out.println(total - Math.abs(a[i] - a[i + 1]) - Math.abs(a[i - 1] - a[i]) + Math.abs(a[i - 1] - a[i + 1]));	
		}
	}
}