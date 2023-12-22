import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		double bunbo = 0;
		for(int i=0; i<N; i++)
			bunbo += 1.0/A[i];
		
		System.out.println(1.0/bunbo);
		sc.close();
	}
}
