
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		if(a >= k) {
			System.out.println(k);
		}
		else if(a + b >= k) {
			System.out.println(a);
		}
		else {
			int temp = k - a - b;
			System.out.println(a - temp);
		}
	}


}
