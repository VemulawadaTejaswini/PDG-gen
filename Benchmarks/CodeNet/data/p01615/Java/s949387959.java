import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		int[] cost = new int[n];
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		
		for(int i=0;i<m;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		int k = 0;
		int p = 0;
		list.push(0);
		while(true){
			k = list.size();
			for(int i=0;i<k;i++){
				p = list.pop();
				for(int j=0;j<m;j++){
					if(p==a[j] && cost[p]+c[j]>cost[b[j]]){
						cost[b[j]] = cost[p] + c[j];
						list.push(b[j]);
					}
				}
			}
			if(list.size()==0) break;
		}
		System.out.println(cost[n-1]);
	}	
}