import java.util.HashMap;
import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<Long,Long> B=new HashMap<Long, Long>();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
			if(i-A[i]>=0) {
				long count = B.containsKey(i-A[i]) ? B.get(i-A[i]) : 0;
				B.put(i-A[i], count + 1);
			}
		}
		long ans=0;
		for(int i=0;i<N;i++) {
			if(B.containsKey(i+A[i]))
			ans+=B.get(i+A[i]);
			if(i-A[i]>=0) {
				long count = B.containsKey(i-A[i]) ? B.get(i-A[i]) : 0;
				B.put(i-A[i], count - 1);
			}
		}
		System.out.println(ans);
}
}
