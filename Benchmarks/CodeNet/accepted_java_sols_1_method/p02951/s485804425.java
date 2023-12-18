
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		int ret = c - ( a - b );
		if(ret < 0) {
			ret = 0;
		}
		System.out.println(ret);

	}

}
