import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int t = 0;
		String ans;
		for(int i =0; i<N.length(); i++) {
			t += Character.getNumericValue(N.charAt(i));
		}

		if (t%9 == 0) {
			ans = "Yes";
		}else {
			ans = "No";
		}
		System.out.println(ans);
		sc.close();
	}
}
