import java.util.*;


public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		int ans = 0;
		for(int i = 0; i < 4; i++) {
			if(N.charAt(i) == '2') {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}