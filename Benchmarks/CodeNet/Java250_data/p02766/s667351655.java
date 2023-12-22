
import java.util.Scanner;
//【156A】
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	int ans =digCount(sc.nextInt(),sc.nextInt());
	System.out.println(ans);
	
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	static int digCount(int n,int k) {
		int res = 0;
		while(n > 0) {
			res ++;
			n /= k;
			}
		return res;
	}
	//----------------------------------------
}