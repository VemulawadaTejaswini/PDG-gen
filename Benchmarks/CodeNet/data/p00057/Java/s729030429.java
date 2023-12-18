import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	static int[] ary = new int[10001];

	public static void main(String[] args) {
		init();
		while(scan.hasNext()){
			out.println(ary[si()]);
		}
		out.flush();
	}

	static void init(){
		ary[0] = 1;
		int b = 1;
		for (int i = 1; i <= 10000; i++) {
			ary[i]=ary[i-1]+b;
			b++;
		}
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}