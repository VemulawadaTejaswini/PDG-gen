import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int S = stdIn.nextInt();
		int ans = 0;
		int mod = 1000000007;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(1);
		A.add(1);
		A.add(1);
		if(3 <= S) {
			for(int i = 6; i <= S; i ++) {
				A.add((A.get(i - 1) % mod + A.get(i - 3)) % mod);
			}
			ans = A.get(S);
		}
		System.out.println(ans);
	}
}