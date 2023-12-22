import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c = 0,buf = 0,ans = 0;;
		for(int i = 0;i < n;i++) {
			c = scn.nextInt();
			if(c ==buf) {
				ans++;
				buf = 0;
			}else {
				buf = c;
			}

		}











		System.out.println(ans);
	}
}
