import java.io.PrintWriter;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int sum = n*l +  n*(1+n)/2 - n;
		// 全て正の場合
		if(l>0) sum -= l;
		// 全て負の場合
		else if(l + n - 1<0) sum -= l+n-1;
		out.println(sum);

		out.flush();
	}
}
