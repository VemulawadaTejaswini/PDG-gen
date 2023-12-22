import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);

		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++)
			p[i] = sc.nextInt()-1;
		
		int[] ad = new int[N];
		int[] bd = new int[N];
		
		for(int i=0; i<N; i++) {
			ad[p[i]] += i+1;
			if(p[i]<N-1)
				bd[p[i]+1] -= i+1;
		}
		int a=1;
		for(int i=0; i<N; i++) {
			a += ad[i];
			pw.print(a + (i<N-1 ? " " : "\n"));
		}
		int b=1000000000;
		for(int i=0; i<N; i++) {
			b += bd[i];
			pw.print(b + (i<N-1 ? " " : "\n"));
		}
		
		sc.close();
		pw.close();
	}
}
