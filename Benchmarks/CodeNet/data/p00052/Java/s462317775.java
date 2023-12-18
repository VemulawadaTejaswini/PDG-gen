import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		while(l-->0) {
			long n = in.nextLong();
			if(n==0L) break;
			int ans = 0;
			for(;n>0;n/=5)ans+=n/5;
			System.out.println(ans);
		}
	}
}