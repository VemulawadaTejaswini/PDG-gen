import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(a+b<=c*2) {
			System.out.println(a*x+b*y);
		}else {
			if(x<y) {
				int ans = Math.min(2*c*x+b*(y-x), 2*c*y);
				System.out.println(ans);
			}else {
				int ans = Math.min(2*c*y+a*(x-y), 2*c*x);
				System.out.println(ans);
			}
		}
		
		in.close();

	}

}
