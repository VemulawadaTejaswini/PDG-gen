
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		int ans =0;
		for (int i=1;2*i-1<=n;i++) {
			if(divisorCount(2*i-1)==8) {
				ans++;
			}
		}
		System.out.println(ans);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	static int divisorCount(int n) {
		int res=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				res++;
			}
		}
		return res;
	}
	//----------------------------------------
}