import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] L = new int[N];
		Map<Integer, Integer> R = new HashMap<>();
		long ans = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			L[i] = A[i] + i;
			if(!R.containsKey(i-A[i]))
				R.put(i-A[i], 1);
			else
				R.put(i-A[i], R.get(i-A[i])+1);
		}
		for(int i : L)
			if(R.containsKey(i))
				ans += R.get(i);
		System.out.println(ans);
	}

}
