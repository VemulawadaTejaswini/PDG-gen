import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		long sum[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		long count =0;
		if (A[0]==0) {
			count ++;
		}
		sum [0]=A[0];
		Map<Long,Long> map = new HashMap<Long,Long>();
		map.put(sum[0], 1l);
		for (int i=1;i<N;i++) {
			sum[i] =sum[i-1]+A[i];
			if (map.containsKey(sum[i])==true) {
				count +=map.get(sum[i]);
				long co=map.get(sum[i])+1;
				map.put(sum[i], co);
			} else {
				map.put(sum[i], 1l);
			}
			if (sum[i]==0) {
				count ++;
			}
		}
		System.out.println(count);
	}
}