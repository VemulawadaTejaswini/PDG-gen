import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		List<Long> cur = new ArrayList<Long>();
		int ind = 1;
		long ret = 0;
		for(int i = N - 1 ; i >= 0 ; --i){
			long a = A[i];
			if(!cur.isEmpty()){
				ret += cur.get(ind / 2);
				ind++;
			}
			cur.add(a);
		}
		System.out.println(ret);
	}
}
