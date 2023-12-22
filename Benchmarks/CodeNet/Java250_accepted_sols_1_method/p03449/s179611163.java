

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] candy = new int[2][N];
		for(int i = 0; i < N; i++) {
			candy[0][i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			candy[1][i] = sc.nextInt();
		}
		int havecandy;
		int firstlinecandy = candy[0][0];
		int secondlinecandy = 0;
		for(int i = 0; i < N; i++) {
			secondlinecandy += candy[1][i];
		}
		havecandy = firstlinecandy + secondlinecandy;
		for(int i = 1; i < N; i++) {
			firstlinecandy += candy[0][i];
			secondlinecandy -= candy[1][i - 1];
			havecandy = Integer.max(havecandy, firstlinecandy + secondlinecandy);
		}
		System.out.println(havecandy);
	}

}
