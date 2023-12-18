import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int ans = 0;
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			if(a >= K)ans++;
		}
		System.out.println(ans);
	}

}
