import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long n = N;
		scn.close();
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n /=10;
		}
		System.out.println(N%sum == 0?"Yes":"No");
	}
}
