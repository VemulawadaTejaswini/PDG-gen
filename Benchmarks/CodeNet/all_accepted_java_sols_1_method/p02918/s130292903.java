import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String str = sc.next();
		char s[] = new char[n];
		int cp = 0;
		for(int i=0; i<n; i++) {
			s[i] = str.charAt(i);
		}
		for(int i=1; i<n; i++) {
			if(s[i-1] != s[i]) cp++;
		}
		int ans = n - 1 - cp;
		for(int i=0; i<k; i++) {
			ans+=2;
		}
		if(ans <= n-1) {
			System.out.println(ans);
		} else {
			System.out.println(n-1);
		}
		
		
	}

}
