import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		for(int i = 0; i < N; i++) {
			X = Math.max(X, sc.nextInt());
		}
		for(int i = 0; i < M; i++) {
			Y = Math.min(Y, sc.nextInt());
		}
		if(X < Y) {
			System.out.println("No War");
		}else {
			System.out.println("War");
		}
	}
}
