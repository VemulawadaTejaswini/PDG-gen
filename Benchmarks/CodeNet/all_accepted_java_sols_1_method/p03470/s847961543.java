import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		int N = sc.nextInt();
		Set<Integer> A = new HashSet<Integer>();
		
		for ( int i = 0; i < N; i++ ) {
			A.add(sc.nextInt()); 
		}
		
		System.out.println(A.size());
		
		sc.close();

	}

}