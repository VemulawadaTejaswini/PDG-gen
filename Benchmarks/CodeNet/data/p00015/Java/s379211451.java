import java.util.*;
import static java.lang.Math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i = 0; i < N; i++) {
			char[] a = in.next().toCharArray(), b = in.next().toCharArray();
			System.out.println(solve(a,b));
		}
	}
	static String solve(char[] ac, char[] bc) {
		StringBuilder ans = new StringBuilder();
		if(ac.length > 80 || bc.length > 80) return "overflow";
		int[] sum = new int[100];
		int max = max(ac.length, bc.length);
		int[] a = new int[max], b = new int[max];
		int count = 0;
		for(int i = max-ac.length; i < max ; i++) {
			a[i] = Character.digit(ac[count++],10);
		}
		count = 0;
		for(int i = max-bc.length; i < max ; i++) {
			b[i] = Character.digit(bc[count++],10);
		}

		int num = sum.length-1;
		for(int i = max-1; i>=0; i--) {
			int x = sum[num]+a[i]+b[i];
			if(x<10) {
				sum[num]=x;
			} else {
				char[] s = String.valueOf(x).toCharArray();
				sum[num - 1] += Character.digit(s[0], 10);
				sum[num]      = Character.digit(s[1], 10);
			}
			num--;
		}
		boolean flg = false;
		for(int x : sum){
			if(!flg && x!=0) flg=true;
			if(flg) ans.append(x);
		}
		return ans.length() > 80 ? "overflow" : ans.toString();
	}
}