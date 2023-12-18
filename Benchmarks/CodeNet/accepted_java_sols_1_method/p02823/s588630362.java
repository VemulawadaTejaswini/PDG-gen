import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if((b-a)%2 == 0) {
			System.out.println((b-a)/2);
		}else {
			long answer = 0;
			if((a-1) > (n-b)) {
				answer = (n-b) + ((n-a) -(n-b) +1)/2;
			}else {
				answer = (a-1) + (b-(a-1) +1)/2;
			}
			System.out.println(answer);
		}
	}

}