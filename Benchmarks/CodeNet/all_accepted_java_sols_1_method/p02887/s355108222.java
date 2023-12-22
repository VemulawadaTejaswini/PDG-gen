import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();
		int ans = 0;
		for(int i=n-1; i>0; i--) {
			if(s.charAt(i) != s.charAt(i-1)) {
				ans ++;
			}
		}

		System.out.println(ans+1);

	}

}
