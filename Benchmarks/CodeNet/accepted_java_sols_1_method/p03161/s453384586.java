
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int h[] = new int[N];
		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		int cost[] = new int[N];
		cost[N-1] = 0;
		cost[N-1-1] = Math.abs(h[N-1] - h[N-1-1]);
		
		for(int i=N-2-1;i>=0;i--) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=1;j<=Math.min(K,N-1-i);j++) {
				list.add(cost[i+j]+Math.abs(h[i+j]-h[i]));
			}
			Collections.sort(list);
			cost[i] = list.get(0);
		}
		
		System.out.println(cost[0]);
	}

}
