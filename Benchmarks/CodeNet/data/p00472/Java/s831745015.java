import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n-1];
			for(int i=0;i<n-1;i++) a[i] = sc.nextInt();
			
			long sum = 0;
			int now = 0;
			int p;
			for(int i=0;i<m;i++){
				p = sc.nextInt();
				if(p>0){
					for(int j=0;j<p;j++) sum += a[now+j];
				}else{
					for(int j=0;j>p;j--) sum += a[now+j-1];
				}
				now += p;
			}
			System.out.println(sum%100000);
		}	
	}	
}