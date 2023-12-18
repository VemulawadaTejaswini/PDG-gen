import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] c = sc.next().toCharArray();
		
		int l = 0;
		int r = c.length - 1;
		
		int cnt = 0;
		while (l < r) {
			if (c[l] == 'W' && c[r] == 'R') {
				cnt++;
				l++;
				r--;
			}
			
			if (c[l] == 'R')
				l++;
			
			if (c[r] == 'W')
				r--;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
