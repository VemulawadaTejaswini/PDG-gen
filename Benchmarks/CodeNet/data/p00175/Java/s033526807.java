import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si();
			if(n==-1) break;

			String ans = "";
			do{
				ans = n%4 + ans;
				n/=4;
			}while(n!=0);
			out.println(ans);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}