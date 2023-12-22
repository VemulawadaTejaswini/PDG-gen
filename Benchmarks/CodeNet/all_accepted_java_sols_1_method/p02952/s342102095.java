import java.io.PrintWriter;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
			
			int N = Integer.parseInt(stdin.next());
			int cnt=0;
			
			for(int i=0;i<=N;i++) {
				if(i<=9999999 && i>=1000000) {
					cnt+=1;
				}
				else if(i<=99999 && i>=10000) {
					cnt+=1;
				}
				else if(i<=999 && i>=100) {
					cnt+=1;
				}
				else if(i<=9 && i>=1) {
					cnt+=1;
				}
			}
			out.println(cnt);
			
			out.flush();
	}
}


