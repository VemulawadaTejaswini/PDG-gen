import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
		int M = scn.nextInt();
		long ans = N;
		for(int i = 0;i<M;i++) {
			ans -= scn.nextInt();
		}
		scn.close();
		if(ans <= -1) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}

}
