import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String n_str = sc.next();
		Integer n = Integer.valueOf(n_str);
		int[] S = new int[n];
			for(int i = 0;i < n; i++)S[i] = sc.nextInt();
		String q_str = sc.next();
		Integer q = Integer.valueOf(q_str);
		int[] T = new int[q];
			for(int i = 0;i < q; i++)T[i] = sc.nextInt();
			
		Arrays.sort(S);
		Arrays.sort(T);
		int count = 0;
		
			for(int i = 0; i < T.length; i++)
			{
				if(Arrays.binarySearch(S, T[i]) >= 0)
				{
					count++;
				}
			}
		System.out.println(count);
	}
}