import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		long ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			Integer pair = map.get(-A[i]+i);
			if(pair != null)
				ans += pair;
			
			pair = map.get(A[i]+i);
			if(pair == null)
				pair = 0;
			map.put(A[i]+i, pair+1);
		}
		
		System.out.println(ans);
		sc.close();
	}
}

