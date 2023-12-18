
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		System.out.println((double)(n-d)*(d==0?1:2)*(m-1)/n/n);
	}
}
