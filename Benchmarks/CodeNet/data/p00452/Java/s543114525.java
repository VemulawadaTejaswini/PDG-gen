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
			
			int r;
			for(int i=0;i<=n;i++){
				for(int j=i;j<=n;j++){
					r = p[i]+p[j];
					if(r<=m && list.contains(r)==false) list.add(r);
				}
			}
			
			r = list.size();
			int[] q = new int[r];
			for(int i=0;i<r;i++) q[i] = list.get(i);
			Arrays.sort(q);
			
			int max = 0;
			for(int i=0;i<r;i++){
				for(int j=i;j<r;j++){
					if(q[i]+q[j]>m) break;
					else max = Math.max(max, q[i]+q[j]);
				}
			}
			System.out.println(max);
		}	
	}	
}