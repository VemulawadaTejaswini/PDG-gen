import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt(), B = scn.nextInt();
		boolean[] ans = new boolean[3];
		ans[A-1] = true;
		ans[B-1] = true;
		for(int i = 0;i < 3;i++ ) {
			if(!ans[i]) {
				System.out.println(i+1);
			}
		}

	}

}
