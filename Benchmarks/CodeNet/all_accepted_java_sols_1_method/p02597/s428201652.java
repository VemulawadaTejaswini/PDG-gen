import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		char[] c = new char[n];
		int countR = 0;
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			c[i] = s.charAt(i);
			if(c[i] == 'R') {
				countR++;
			}
		}
		
		for(int i=0;i<countR;i++) {
			if(c[i] == 'R') {
				continue;
			}else {
				ans++;
			}
		}
		System.out.println(ans);

	}

}