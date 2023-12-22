import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int cnt = 0;
		
		if (s.charAt(0) == '1') cnt++;
		if (s.charAt(1) == '1') cnt++;
		if (s.charAt(2) == '1') cnt++;
		
		System.out.println(cnt);
	}

}
