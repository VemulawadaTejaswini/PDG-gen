import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op,ta;
	Scanner sc = new Scanner(System.in);
	public void solve() {
		n=sc.nextInt();
		if(n%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
	public static void main(String[] args) {
		new Main().solve();
	}
}