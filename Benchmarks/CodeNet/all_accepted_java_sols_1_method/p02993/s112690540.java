import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean flag = true;
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i - 1)==S.charAt(i)) {
				flag = false;
				break;
			}
		}
		System.out.println((flag)?"Good":"Bad");
	}
}