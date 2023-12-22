import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		double v[] = new double[N];

		for(int i=0;i<N;i++) {
			v[i] = Integer.parseInt(stdin.next());
		}
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(v[i] > v[j]) {
					double max = v[i];
					v[i] = v[j];
					v[j] = max;
				}
			}
		}
		
		for(int i=0;i<N-1;i++) {
			v[i+1] = (v[i]+v[i+1])/2;
		}
		
		out.println(v[N-1]);

		out.flush();
	}
	
}