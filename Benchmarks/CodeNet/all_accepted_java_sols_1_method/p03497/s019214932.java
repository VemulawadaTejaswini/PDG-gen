import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			Integer countA = count.get(A);
			if(countA==null)
				countA=0;
			
			count.put(A, countA+1);
		}
		Integer[] value = count.values().toArray(new Integer[0]);
		Arrays.sort(value);
		int ans = 0;
		for(int i=0; i<value.length-K; i++)
			ans += value[i];
		
		System.out.println(ans);
				
		sc.close();
	}
}
