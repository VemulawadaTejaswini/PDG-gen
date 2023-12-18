import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static Scanner sc = new Scanner(System.in);
	
	
	void run() {
		int n = sc.nextInt();
		int a, b, c;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a*a+b*b == c*c || b*b+c*c == a*a || c*c+a*a == b*b)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}