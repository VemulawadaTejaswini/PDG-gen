import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] s = S.toCharArray();
		int count=0;
		
		if(N%2 != 0) {
			System.out.println("No");
			
		}
		else {
			for(int i=0;i<N/2;i++) {
				if(s[i]!=s[N/2+i]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
