
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int m = Integer.parseInt(sc.next());
		
		int sum = 0;
		
		for(int i = 0 ; i < m ;i++) {
			int a = Integer.parseInt(sc.next());
			sum  += a;
		}
		
		if(sum > n) {
			System.out.println(-1);
		}
		else {
			System.out.println(n - sum);
		}

	}

}
