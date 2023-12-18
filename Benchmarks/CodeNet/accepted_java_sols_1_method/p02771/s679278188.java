import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int r2 = scan.nextInt();
		int r3 = scan.nextInt();
		boolean flg = false;
		//String str = scan.nextLine();
		//String[] substr = str.split(" ", 0);
		if (r1 == r2 ) {
			flg = true;
		}
		String ans = "Yes";
		if (flg ) {
			if (r1 == r3) {
				ans = "No";
			}
		} else {
			if (r1 == r3 || r2 == r3) {
				ans = "Yes";
			} else {
				ans = "No";
			}
		}
		//int ans = 0;
		//for (int i=c1; i<c2+1;i++) {
		//}
		System.out.println(ans);
	}

}