import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int X = scn.nextInt();
		int Y = scn.nextInt();
		for(int i = 0;i < N;i++) {
			X = Math.max(X, scn.nextInt());
		}
		for(int i = 0;i < M;i++) {
			Y = Math.min(Y, scn.nextInt());
		}
		System.out.println(!(X<Y)?"War":"No War");
		scn.close();
	}
}
