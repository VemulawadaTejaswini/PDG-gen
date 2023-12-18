import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
//		int[] a = new int[n];
		BitSet bs = new BitSet(n);
		for(int i=0; i<m; i++){
//			a[in.nextInt()] = 1;
			bs.set(in.nextInt()-1);
		}
		int bf = -1;
		int[] dist = new int[n];
		for(int i=0; i<n; i++){
			if(bs.get(i)) bf = i;
			if(bf>=0){
				dist[i] = Math.abs(i-bf);
			}else{
				dist[i] = Integer.MAX_VALUE;
			}
		}
		bf = -1;
		for(int i=n-1; i>=0; i--){
			if(bs.get(i)) bf = i;
			if(bf>=0){
				dist[i] = Math.min(dist[i], Math.abs(i-bf));
			}
		}
		int max = 0;
		for(int i=0; i<n; i++){
			
		}
		for(int i=0; i<n; i++) max = Math.max(max, dist[i]);
		System.out.println(max);
	}
}