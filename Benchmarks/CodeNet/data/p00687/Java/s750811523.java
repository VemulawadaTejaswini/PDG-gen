import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(n==0 && a==0 && b==0) break;
			
			int cnt = 0;
			boolean[] f = new boolean[n+1];
			f[0] = true;
			for(int i=1;i<=n;i++){
				if(i-a>=0 && f[i-a]==true) f[i] = true;
				if(i-b>=0 && f[i-b]==true) f[i] = true;
				if(f[i]==false) cnt++;
			}
			
			System.out.println(cnt);
		}	
	}	
}