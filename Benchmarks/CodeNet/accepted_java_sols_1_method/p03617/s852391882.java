import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long q = sc.nextLong();
		long h = sc.nextLong();
		long s = sc.nextLong();
		long d = sc.nextLong();

		long n = sc.nextLong();
		long target = q *4;
		if(target > h *2) {
			target = h *2;
		}
		if(target > s) {
			target =s;
		}
		if(target > (double)d /2.0 && n >=2 ) {
			long answer = (d * (n/2)) +(target * (n%2));
			System.out.println(answer);
		}else {
			System.out.println(target * n);
		}

	}
}