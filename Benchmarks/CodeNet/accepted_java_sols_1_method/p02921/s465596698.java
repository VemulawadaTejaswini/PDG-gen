import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S= sc.nextLine();
		String T = sc.nextLine();
		sc.close();

		int ans = 0;

		for (int i=0; i<3; i++){
			if (S.charAt(i) == T.charAt(i)){
				ans++;
			}
		}

		System.out.println(ans);
	}

}
