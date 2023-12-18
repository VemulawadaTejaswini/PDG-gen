import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		long mul = 1;
		for (int i = 0; i < num; i++) {
			long n = s.nextLong();
			mul *= n;
		}
		
		s.close();

		if (mul > 1000000000000000000L) {
			System.out.println(-1);
		}
        else if (mul < -1) {
			System.out.println(-1);
        }
		else {
			System.out.println(mul);
		}
		

	}

}
