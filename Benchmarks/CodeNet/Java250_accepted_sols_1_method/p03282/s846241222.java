import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		long len = 0;
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length; i++) {
			long temp = c[i]-'0';
			k -= (long) Math.pow(temp, 5*Math.pow(10, 15));
			if(k <=0) {
				System.out.println(temp);
				break;
			}
		}
	}
}