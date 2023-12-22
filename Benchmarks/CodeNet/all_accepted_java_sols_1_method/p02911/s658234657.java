import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int P[] = new int[N];
		int A;
		for(int i = 0; i < N; i++) {
			P[i] = K;
		}
		for(int i = 0; i < Q; i++) {
			A=sc.nextInt();
			P[A-1]++;
		}
		for(int i = 0; i < N; i++) {
			P[i] = P[i]-Q;
		}
		for(int i = 0; i < N; i++) {
			if(P[i] > 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}	
}