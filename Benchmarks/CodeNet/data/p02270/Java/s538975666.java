import java.util.*;
public class Main{
	public static boolean check(long p, long w[], long k, int n){
		int id = 0;
		while(k > 0L){
			long sum = 0;
			while(id < n && sum + w[id] <= p)
				sum += w[id++];
			if(id == n)
				return true;
			else
				k--;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long w[] = new long[n];
		for(int i =0  ;i < n ; i++)
			w[i] = sc.nextLong();
		long min = 0;
		long max = 1000000000;
		while(max - min > 1L){
			long mid = (min + max) / 2L;
			if(check(mid,w,k,n)){	
				max = mid;
			}
			else{
				min = mid;
			}
		}
		System.out.println(max);
	}
}
