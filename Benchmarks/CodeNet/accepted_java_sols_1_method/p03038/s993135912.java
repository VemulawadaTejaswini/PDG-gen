import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeMap;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] a = new long[n];
		TreeMap<Long,Integer> map=new TreeMap<>();
		for(int i=0; i<n; i++){
			a[i]= sc.nextLong();
		}
		Arrays.sort(a);
		for(int i=0; i<m; i++){
			int b = sc.nextInt();
			long c = -sc.nextLong();
			if(map.containsKey(c)){
				map.put(c,b+map.get(c));
			}else{
				map.put(c,b);
			}
		}
		long ans=0;
		int i=0;
		for(long k:map.keySet()){
			int count=map.get(k);
			for(;i<n; i++){
				if(a[i]<-k){
					count--;
					a[i]=-k;
				}
				if(count==0){
					break;
				}
			}
		}
		for(i=0; i<n; i++){
			ans+=a[i];
		}
		System.out.println(ans);
	}
}
