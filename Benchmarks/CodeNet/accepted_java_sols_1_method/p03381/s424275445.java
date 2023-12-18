import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int[] X = new int[N];
		for(int i=0; i<N; i++)
			X[i] = sc.nextInt();
		int[] X2 = X.clone();
		Arrays.sort(X2);
		
		for(int i=0; i<N; i++) {
			pw.println(X[i]<=X2[N/2-1] ? X2[N/2] : X2[N/2-1]);
		}
				
		sc.close();
		pw.close();
	}
}
