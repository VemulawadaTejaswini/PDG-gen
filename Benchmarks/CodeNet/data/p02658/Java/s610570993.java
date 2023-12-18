import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long num = s.nextLong();
		long mul = 1;
		for (int i = 0; i < num; i++) {
			long n = s.nextLong();
			if (n == 0) {
			    System.out.println(0);
			    System.exit(0);
		
			}
			mul *= n;
			
            if (mul < -1) {
    			System.out.println(-1);
    			System.exit(0);
            }			
		}
		
		s.close();

		if (mul > 1000000000000000000L) {
			System.out.println(-1);
		}

		else {
			System.out.println(mul);
		}
		

	}

}