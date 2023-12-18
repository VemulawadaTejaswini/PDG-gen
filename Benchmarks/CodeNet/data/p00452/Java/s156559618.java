import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] p = new int[n+1];
			for(int i=1;i<=n;i++) p[i] = sc.nextInt();
			
			int r, q;
			for(int i=0;i<=n;i++){
				for(int j=i;j<=n;j++){
					r = p[i]+p[j];
					if(r<=m && list.contains(r)==false) list.add(r);
				}
			}
			Collections.sort(list);
			
			r = list.size();
			int max = 0;
			for(int i=0;i<r;i++){
				q = list.get(i);
				for(int j=r-1;j>=0;j--){
					if(q+list.get(j)<=m){
						max = Math.max(max, q+list.get(j));
						break;
					}
				}
			}
			System.out.println(max);
		}	
	}	
}