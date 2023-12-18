import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger s1 = new BigInteger(stdIn.next());
			BigInteger s2 = new BigInteger(stdIn.next());
			
			s1 = s1.add(s2);
			String tmp = s1.toString();
			if(tmp.length() > 80) {
				tmp = "overflow";
			}
			System.out.println(tmp);
		}
		
	}
	
}