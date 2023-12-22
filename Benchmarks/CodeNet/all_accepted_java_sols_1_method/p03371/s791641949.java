import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans1 = a*x + b*y;
		int ans2 = 2*c*Math.min(x, y);
		if(x>y)ans2 += (x-y)*a;
		else if(x<y)ans2 += (y-x)*b;
		int ans3 = 2*c*Math.max(x, y);
		System.out.println(Math.min(ans1, Math.min(ans2, ans3)));
	}

}
