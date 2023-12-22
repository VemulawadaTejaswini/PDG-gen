import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int[] d = new int[K];
		int[][] A;
		A = new int[K][];
		
		for(int i=0; i<K; i++) {
		    d[i] = s.nextInt();
		    A[i] = new int[d[i]];
			for(int k=0; k<d[i]; k++) {
				A[i][k] = s.nextInt();
			}
			
		}
		ArrayList<Integer> sunukes = new ArrayList<Integer>();
		for(int i=0; i<K; i++) {
			for(int k=0; k<d[i]; k++) {
				if(sunukes.contains(A[i][k])) {}
				else {sunukes.add(A[i][k]);}
			}
		}
		int ans = N - sunukes.size();
		System.out.println(ans);
	}

}
