import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		
		int xorAll = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			xorAll ^= a[i];
		}
		
		for(int i=0; i<N; i++) {
			pw.print((xorAll^a[i]) + (i==N-1 ? "\n" : " "));
		}
		
		sc.close();
		pw.close();
	}
	
}
