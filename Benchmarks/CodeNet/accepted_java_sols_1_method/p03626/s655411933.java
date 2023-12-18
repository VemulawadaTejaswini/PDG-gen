import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s1 = in.next();
		String s2 = in.next();
		int mod = 1000000007;
		long ans = 0;
		int i=0;
		boolean tate = true;
		if(s1.charAt(i)==s2.charAt(i)) {
			ans = 3;
			tate = true;
			i = 1;
		}else {
			ans = 6;
			tate = false;
			i = 2;
		}
		for(;i<n;i++) {
			if(tate) {
				if(s1.charAt(i)==s2.charAt(i)) {
					ans = ans*2%mod;
					tate = true;
				}else {
					ans = ans*2%mod;
					tate = false;
					i++;
				}
			}else {
				if(s1.charAt(i)==s2.charAt(i)) {
					ans = ans%mod;
					tate = true;
				}else {
					ans = ans*3%mod;
					tate = false;
					i++;
				}
			}
		}
		System.out.println(ans);
		in.close();
	}

}
