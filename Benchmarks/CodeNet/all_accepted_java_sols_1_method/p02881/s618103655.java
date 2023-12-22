import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		for(long i = (long)Math.sqrt(N);i>0;i--) {
			if(N%i==0) {
				long j = N/i;
				System.out.println(j + i - 2);
				return;
			}
		}
	}

}
