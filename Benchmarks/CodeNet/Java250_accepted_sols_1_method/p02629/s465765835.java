import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		char[] c = {'a','b','c','d','e','f','g','h',
			'i','j','k','l','m','n','o','p','q','r',
			's','t','u','v','w','x','y','z'};

		StringBuffer sb = new StringBuffer();

		while(n > 0) {
			if(n <= 26) {
				sb.insert(0, c[((int)n)-1]);
				break;
			}
			long result = n % 26;
			if(result==0) {
				sb.insert(0, c[25]);
				n-=26;
			} else {
				sb.insert(0, c[((int)result)-1]);
			}
			n = n / 26;
		}
		System.out.println(sb.toString());
	}

}