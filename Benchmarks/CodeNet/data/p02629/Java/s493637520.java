import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		int ctr = 0;
		long num = 0;
		
		while(n>num*26+26) {
			num = num*26+26;
			ctr++;
		}
		n = n-num-1;
		while(ctr>=0) {
			long ans = (long)(Math.pow(26, ctr));
			long r = (n/ans);
			System.out.print((char)(r+97));
			n = n%ans;
			ctr--;
		}
		
		
	}

}
