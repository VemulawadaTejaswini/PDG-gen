import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long x = s.nextLong();
		long answer = 0;

		long q = (b / x) - (a / x);

		if(a%x==0) {
			q = q+1;
		}


		System.out.println(q);
	}

}