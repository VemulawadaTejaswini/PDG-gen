import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int nt = 0,nx = 0, ny = 0;
		boolean ans = true;
		for(int i = 0;i < N && ans;i++) {
			int t = scn.nextInt();
			int x = scn.nextInt();
			int y = scn.nextInt();
			if(t-nt < Math.abs(x-nx) + Math.abs(y-ny)) {
				ans = false;
			}
			if(((t-nt) - Math.abs(x-nx) + Math.abs(y-ny))%2 == 1) {
				ans = false;
			}
		}
		System.out.println(ans?"Yes":"No");
	}

}
