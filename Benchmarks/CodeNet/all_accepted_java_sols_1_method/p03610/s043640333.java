import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.next();
		sc.close();
		StringBuffer ans = new StringBuffer();
		for(int i = 0; i < s.length(); ++i) {
			if(i % 2 == 0)ans.append(s.charAt(i));
		}
		
		System.out.println(ans);
	}

}
