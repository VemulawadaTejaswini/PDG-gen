import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int[] a = new int[3], m = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = si();
				m[i] = si();
			}
			if(a[0]==0) break;
			int[] p = new int[3], cnt = new int[3];
			p[0] = p[1] = p[2] = 1;
			for(int i = 0; i < 3;i++)
				do{
					cnt[i]++;
					p[i] = p[i]*a[i]%m[i];
				}while(p[i]!=1);
			int tmp = cnt[0]*cnt[1]/gcd(cnt[0],cnt[1]);
			out.println(tmp*cnt[2]/gcd(tmp,cnt[2]));
		}
		out.flush();
	}

	static int gcd(int a,int b){
		if(b==0) return a;
		if(a<b) return gcd(a,b%a);
		else return gcd(b,a%b);
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}