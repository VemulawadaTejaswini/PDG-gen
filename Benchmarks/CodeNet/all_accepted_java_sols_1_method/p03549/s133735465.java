import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int x = 1900 * m + 100 * (n - m);
		int p = (int)Math.pow(2, m);
		
		System.out.println(p * x);
	}

}
