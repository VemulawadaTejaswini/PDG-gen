import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op,targetStr;
	Scanner sc = new Scanner(System.in);
	public void solve() {
		n=sc.nextInt();
		m=sc.nextInt();
		as=sc.nextInt();
		hun=m*as;
		if(hun<n) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
	public static void main(String[] args) {
		new Main().solve();
	}
}
