import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
//------------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean buyability = false;

		for (int i=0 ; 4*i<=n ; ++i) {
			for (int j =0 ; 7*j<=n-4*i ; ++j) {
				int total = 4*i+7*j ;
				if (total == n) {
					buyability =true;
				}
			}
		}
		if (buyability) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
//------------------------------------------------------------
	}
}