import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0 && b==0 && c==0) break;
			
			int n = sc.nextInt();
			int[] ans = new int[a+b+c+1];
			int[] s = new int[n];
			int[] t = new int[n];
			int[] u = new int[n];
			int r;
			
			for(int i=0;i<n;i++){
				s[i] = sc.nextInt();
				t[i] = sc.nextInt();
				u[i] = sc.nextInt();
				r = sc.nextInt();
				if(r==1){
					ans[s[i]] = 1;
					ans[t[i]] = 1;
					ans[u[i]] = 1;
				}		
			}
			
			for(int i=0;i<n;i++){
				if(ans[s[i]]==1 && ans[t[i]]==1 && ans[u[i]]==0) ans[u[i]] = 2;
				else if(ans[t[i]]==1 && ans[u[i]]==1 && ans[s[i]]==0) ans[s[i]] = 2;
				else if(ans[u[i]]==1 && ans[s[i]]==1 && ans[t[i]]==0) ans[t[i]] = 2;
			}
			
			for(int i=1;i<=a+b+c;i++){
				if(ans[i]==0) System.out.println("2");
				else if(ans[i]==1) System.out.println("1");
				else if(ans[i]==2) System.out.println("0");
			}

		}
	}	
}