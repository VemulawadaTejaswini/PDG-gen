import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(n==0 && a==0 && b==0) break;
			
			boolean[] f = new boolean[n+1];
			for(int i=0;i<=n;i+=a){
				for(int j=0;i+j<=n;j+=b){
					f[i+j] = true;
				}
			}
			
			int cnt = 0;
			for(int i=0;i<=n;i++){
				if(f[i]==false) cnt++;
			}
			System.out.println(cnt);
		}	
	}	
}