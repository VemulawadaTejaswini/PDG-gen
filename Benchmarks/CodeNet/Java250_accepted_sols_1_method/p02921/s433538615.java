import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String N = sc.next();
	String T = sc.next();
	int cnt = 0;

	if(N.charAt(0)==T.charAt(0)) {
		cnt++;
	}
	if(N.charAt(1)==T.charAt(1)) {
		cnt++;
	}
	if(N.charAt(2)==T.charAt(2)) {
		cnt++;
	}
	System.out.println(cnt);

	}
}
