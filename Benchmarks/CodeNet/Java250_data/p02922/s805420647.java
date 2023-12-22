import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(b == 1) {
			System.out.print(0);
		}
		else {
			while(true) {
				if(((a * ans) - (ans - 1)) >= b) {
					break;
				}
				ans++;
			}
			System.out.print(ans);
		}
	}
}