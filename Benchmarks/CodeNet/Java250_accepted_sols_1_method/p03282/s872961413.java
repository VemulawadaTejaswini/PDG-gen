import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		int oneCount = 0;
		int nextNum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				oneCount++;
			} else {
				nextNum = s.charAt(i) - '0';
				break;
			}
		}
		if (k <= oneCount) {
			System.out.println(1);
		} else {
			System.out.println(nextNum);
		}
	}
}
