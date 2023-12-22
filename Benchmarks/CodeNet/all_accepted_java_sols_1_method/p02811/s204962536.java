
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		
		int x = Integer.parseInt(sc.next());
		
		int ans = 500 * k;
		
		if(ans >= x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
