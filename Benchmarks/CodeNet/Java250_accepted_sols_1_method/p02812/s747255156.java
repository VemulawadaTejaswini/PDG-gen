import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str = sc.next();
		int cnt=0;

		for(int i=0; i<n-2;i++) {
			char ch = str.charAt(i);
			if(ch == 'A' ) {
				if(str.charAt(i+1)=='B') {
					if(str.charAt(i+2) == 'C') {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}