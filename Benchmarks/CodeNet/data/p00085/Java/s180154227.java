

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(true){
			int n = si(),m = si();
			if(n==0) break;

			boolean[] ary = new boolean[n];
			int cnt = 0,pos = 0;
			while(cnt!=n){
				for (int i = 0; i < m ;) {
					if(ary[pos]) pos++;
					else{
						pos++;
						i++;
					}
					pos%=n;
				}
				pos=(pos-1+n)%n;
				cnt++;
				ary[pos]=true;
			}
			out.println(pos+1);
		}
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}