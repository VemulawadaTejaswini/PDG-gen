import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		s.close();
		long disA = 0;
		long disB = 0;

		if(a < 0) {
			disA = a * -1;
		}else {
			disA = a;
		}
		if(b < 0) {
			disB = b * -1;
		}else {
			disB = b;
		}

		long judge = (disA + disB) % 2;
		if(judge == 1) {
			System.out.println("IMPOSSIBLE");
		}else {
			long disC = (disA + disB)/2;
			System.out.println(disC);
		}

	}

}
