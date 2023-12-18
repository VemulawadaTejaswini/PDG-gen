import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		int ans = 0;
		int num = 1;
		for(int i=1;i<n;i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				ans++;
			}else {
				num++;
			}
		}
		if(num%2==1) {
			if(num/2<=k) ans = n-1;
			else ans += 2*k;
		}else {
			if(num/2<=k) ans = n-1;
			else if(num/2==k+1) ans = n-2;
			else ans += 2*k;
		}
		System.out.print(ans);
		in.close();

	}

}
