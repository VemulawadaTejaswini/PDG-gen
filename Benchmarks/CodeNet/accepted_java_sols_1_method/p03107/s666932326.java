import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char s[] =  scan.next().toCharArray();
		int zeroCount = 0;
		int oneCount = 0;

		for(int i = 0; i < s.length; i++) {
			if(s[i] == '0') {
				zeroCount++;
			}else {
				oneCount++;
			}
		}
		
		System.out.println(2 * Math.min(zeroCount, oneCount));
		
	}
}