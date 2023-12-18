import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	static int cnt = 0;

	public static void main(String[] args) {
		while(true){
			int n = si(),m = si();
			if(n==0) break;
			out.println(gcd(n,m)+" "+(cnt-1));
			cnt = 0;
		}
		out.flush();
	}

	static int gcd(int a,int b){
		cnt++;
		if(b==0) return a;
		if(a<b) return gcd(a,b%a);
		else return gcd(b,a%b);
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}