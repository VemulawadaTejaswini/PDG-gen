import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		String ans="Yes";
		while(true) {
			if (c-b>0) {
				c= c-b;
				if (a-d>0) {
					a=a-d;
				} else {
					ans = "No";
					break;
				}
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
