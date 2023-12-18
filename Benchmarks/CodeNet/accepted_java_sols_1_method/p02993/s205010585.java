import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String ans[] = {"Bad", "Good"};
		int an = 1;
		for(int i = 0; i < s.length() - 1; ++i) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				an = 0;
				break;
			}
		}
		
		System.out.println(ans[an]);
	}
}
