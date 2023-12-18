import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int X = stdIn.nextInt();
		int Y = stdIn.nextInt();
		int[] a = new int[N - 1];
		for(int i = 0; i < a.length; i ++) {
			a[i] = 0;
		}
		
		for(int i = 1; i < N; i ++) {
			for(int j = i + 1; j <= N; j ++) {
				int normal = j - i;
				int warp = Math.abs(i - X) + 1 + Math.abs(j- Y);
				a[Math.min(normal, warp) - 1] ++;
			}
		}
		
		for(int num: a) {
			System.out.println(num);
		}
	}
}