import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String slime = scan.next();
		char color[] = new char[n];
		
		for(int i=0;i<n;i++) {
			color[i] = slime.charAt(i);
		}
		
		for(int i=1;i<n;i++) {
			if(color[i-1] == color[i]) {
				color[i-1] = '0';
			}
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			if(color[i] != '0') {
				ans += 1;
			}
		}
		
		System.out.println(ans);
		
		
		
		
	}

}
