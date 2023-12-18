import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if(n==0 && q==0) break;
			
			int[] a = new int[102];
			int m;
			for(int i=0;i<n;i++){
				m = sc.nextInt();
				for(int j=0;j<m;j++) a[sc.nextInt()]++;
			}
			
			int ans = 0;
			for(int i=n;i>=q;i--){
				for(int j=0;j<102;j++){
					if(a[j]==i){
						ans = j;
						i = -1;
						j = 102;
					}
				}
			}
			System.out.println(ans);
		}	
	}	
}