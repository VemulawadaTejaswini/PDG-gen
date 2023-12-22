import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] week = new String[] {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int[] ans = new int[] {7,6,5,4,3,2,1};
		String X = sc.next();

		for (int i = 0; i < ans.length; i++) {
			if (X.equals(week[i])) {
				System.out.println(ans[i]);
			}
		}
	}
}