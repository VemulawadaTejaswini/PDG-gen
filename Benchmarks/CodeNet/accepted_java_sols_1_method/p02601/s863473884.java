import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		while (k > 0) {
			if (a >= b)
				b *= 2;
			else if (b >= c)
				c *= 2;
			k--;
		}
		
		String ans = a < b && b < c ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
	
}

