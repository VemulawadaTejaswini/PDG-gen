import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.nextLine();

		String[] ans = new String[2*H];
		for(int i=0;i<H;i++) {
			String s = sc.nextLine();
			ans[2*i] = s;
			ans[2*i + 1] = s;
		}

		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}
