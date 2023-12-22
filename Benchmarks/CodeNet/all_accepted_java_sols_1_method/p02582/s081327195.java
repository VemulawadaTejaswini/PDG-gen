import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int ans = 0;
		
		if(s.charAt(0) == 'R') {
			ans++;
			if(s.charAt(1) == 'R') {
				ans++;
				if(s.charAt(2) == 'R') {
					ans++;
				}
			}
		}else if(s.charAt(1) == 'R') {
			ans++;
			if(s.charAt(2) == 'R') {
				ans++;
			}
		}else if(s.charAt(2) == 'R'){
			ans++;
		}
		System.out.println(ans);

	}

}
