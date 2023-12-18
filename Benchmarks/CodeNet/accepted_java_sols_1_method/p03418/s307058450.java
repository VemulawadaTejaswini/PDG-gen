import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		in.close();
		if(k==0) {
			System.out.println((long)n*n);
		}else {
			long ans = 0;
			for(int b=1;b<=n;b++) {
				if(b<k+1) continue;
				ans += (n/b)*(b-k);
				int remain = n-(n/b)*b;
				ans += remain>=k ? remain-k+1 : 0;
			}
			System.out.println(ans);
		}
	}

}
