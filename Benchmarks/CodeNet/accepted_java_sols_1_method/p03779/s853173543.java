
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, t;
		
		x = sc.nextInt();
		
		sc.close();
		
		t = (int)Math.ceil((-3.0 + Math.sqrt(9.0 - 8.0 * (1.0 - (double)x))) / 2.0); 
		System.out.println(t + 1);
	}

}
