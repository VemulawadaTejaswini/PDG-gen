import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		long n = sc.nextLong() ;
		long m = sc.nextLong();
		sc.close();
		long count = 0;
		if((n==1) || (m==1)) {
			if(n > m) {
				count = n - 2;
			}else if(m > n) {
				count = m -2;
			}else {
				count = 1;
			}
		}else {
			count = (n-2)*(m-2);
		}
		System.out.println(count);
	}
}
