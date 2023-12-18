import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long X = scn.nextLong();
		long Y = scn.nextLong();
		int ans = 0;
		while(X<=Y) {
			X*=2;
			ans++;
		}
		
		System.out.println(ans);

	}

}
