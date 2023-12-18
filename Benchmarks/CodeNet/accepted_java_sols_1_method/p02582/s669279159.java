
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int cnt = 0;
		int ans = 0;
		for(int i = 0 ; i < 3 ;i++) {
			if(s.charAt(i) == 'R') {
				cnt++;
			}
			else {
				cnt = 0;
			}
			ans = Math.max(ans, cnt);
		}
		
		System.out.println(ans);

	}

}
