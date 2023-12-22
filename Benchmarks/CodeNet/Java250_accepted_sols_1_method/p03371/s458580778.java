import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int ans = 0;
		int min = Math.min(x, y);
		int minac = Math.min(a, c*2);
		int minbc = Math.min(b, c*2);
		
		if(a+b <= c*2) {
			ans = a*x + b*y;
		}else {
			ans = c*2*min + minac*(x-min) + minbc*(y-min); 
		}
		System.out.println(ans);
	}
}