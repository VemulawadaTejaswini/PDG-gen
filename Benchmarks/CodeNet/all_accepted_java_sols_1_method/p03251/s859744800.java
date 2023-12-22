import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int x[] = new int[N];
		int y[] = new int[M];
		
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}
		
		int maxX = x[0];
		int minY = y[0];
		
		for (int i = 0; i < N; i++) {
			if (x[i] > maxX) {
				maxX = x[i];
			}
		}
		
		for (int i = 0; i < M; i++) {
			if (y[i] < minY) {
				minY = y[i];
			}
		}
		
		int maxXX = Math.max(maxX, X);
		int minYY = Math.min(minY, Y);
		
		if (minYY > maxXX) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
		
	}
}