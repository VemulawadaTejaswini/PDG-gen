import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] score = new int[N];
		Arrays.fill(score, K-Q);
		for(int i=0; i<Q; i++)
			score[sc.nextInt()-1]++;
		
		for(int i=0; i<N; i++)
			pw.println(score[i]>0 ? "Yes" : "No");

		sc.close();
		pw.close();
	}
}
