import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int K = Integer.parseInt(stdin.next());
		int X = Integer.parseInt(stdin.next());
		
		int i;
		int j;
		
		for(i=0;i<K-1;i++) {
			if(X-i <= -1000000) break;
		}
		for(j=0;j<K-1;j++) {
			if(X+j > 1000000) break;
		}

		for(int z=X-i;z<=X+j;z++) {
			out.print(z+" ");
		}
		out.flush();
	}

	
}