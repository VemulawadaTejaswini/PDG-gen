import java.util.Scanner;
public class Main {
	int as,kl,o,m,n;
	char p;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
	n=sc.nextInt();
	as=n*n;
	kl=n*n*n;
	System.out.println(n+as+kl);
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}
