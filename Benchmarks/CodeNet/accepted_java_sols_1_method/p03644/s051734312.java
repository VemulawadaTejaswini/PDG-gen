import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int pow2 = 1;
		
		while(pow2*2 <= n) {
			pow2 *= 2;
		}
		
		System.out.println(pow2);
	}

}
