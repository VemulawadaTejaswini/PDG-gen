
import java.util.Scanner;

public class _0054 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			a%=b;
			int s = 0;
			for (int i = 0; i < n; i++) {
				s+=a*10/b;
				a=a*10%b;
			}
			System.out.println(s);
		}
	}
}