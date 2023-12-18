import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(c[i]=='R') {
				count++;
			}
		}
		int ans = count;
		for(int i = 0; i < count; i++) {
			if(c[i]=='R') {
				ans--;
			}
		}
		System.out.println(ans);
	}
}