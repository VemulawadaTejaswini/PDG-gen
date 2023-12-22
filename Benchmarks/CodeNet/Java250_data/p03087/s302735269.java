import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int [] l = new int [Q];
		int [] r = new int [N];
		int sum = 0;
		for (int i = 0; i < N-1; i++) {
			
			if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
			
				sum++;
				r[i+1] += sum;
			
			} 
			
			else {
				r[i+1] += sum;
			}
		
		}
		
		for (int i = 0; i < Q; i++) {
		
			int start = sc.nextInt() - 1;
			int fin = sc.nextInt() - 1;
			l[i] = r[fin] - r[start];
			
		}
		
		for (int T = 0; T < Q; T++) {
			System.out.println(l[T]);
		}

	}	

}