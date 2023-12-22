import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "No";
		int c=0;
		int d = 0;

		while(4*c+7*d<=n) {
			while(4*c+7*d<=n) {
				if(4*c+7*d==n) {
					ans = "Yes";
					break;
				}else d++;
			}
			c++;
			d=0;
		}
		System.out.println(ans);
	}


}