import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=0; i<M; i++) {
			if(i%2==0)
				pw.printf("%d %d\n", (N+1)/2-i/2, (N+1)/2+1+i/2);
			else
				pw.printf("%d %d\n", i/2+2, N-i/2);
		}
		sc.close();
		pw.close();
	}
}
