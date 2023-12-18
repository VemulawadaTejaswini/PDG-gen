import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int m = sc.nextInt()-1;
			int[] a = new int[m];
			int[] b = new int[m+1];
			int x = sc.nextInt();
			int y = sc.nextInt();
			int p, q;
			for(int i=0;i<m;i++){
				p = sc.nextInt();
				q = sc.nextInt();
				a[i] = p-x + q-y;
				if(i!=0){
					if(a[i-1]*a[i]>0) b[i] = 1;
					else b[i] = -1;
				}
				if(q==y) b[i] = -b[i];
				x = p;
				y = q;
			}

			boolean flag;
			for(int i=1;i<=n;i++){
				int r = sc.nextInt()-1;
				int[] c = new int[r];
				int[] d = new int[r+1];
				x = sc.nextInt();
				y = sc.nextInt();
				for(int j=0;j<r;j++){
					p = sc.nextInt();
					q = sc.nextInt();
					c[j] = p-x + q-y;
					if(j!=0){
						if(c[j-1]*c[j]>0) d[j] = 1;
						else d[j] = -1;
					}
					if(q==y) d[j] = -d[j];
					x = p;
					y = q;
				}
				if(r!=m) continue;
				
				flag = false;
				for(int j=0;j<m;j++){
					if(Math.abs(a[j])==Math.abs(c[j]) && b[j]==d[j]);
					else{
						flag = true;
						break;
					}
				}
				if(flag==false){
					System.out.println(i);
					continue;
				}
				
				flag = false;
				for(int j=0;j<m;j++){
					if(Math.abs(a[j])==Math.abs(c[m-1-j]) && b[j]==-d[m-j]);
					else{
						flag = true;
						break;
					}
				}
				if(flag==false)System.out.println(i);
			}
			System.out.println("+++++");
		}	
	}	
}