import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0)break;
			int[] masu = new int[n];
			int[] d = new int[m];
			for(int i=0;i<n;i++){
				masu[i] = sc.nextInt();
			}
			for(int i=0;i<m;i++){
				d[i] = sc.nextInt();
			}
			
			int now = 0;
			for(int i=0;i<m;i++){
				if(now+d[i]>=9){
					System.out.println(i+1);
					break;
				}
				now = now + d[i] + masu[now+d[i]];
				if(now<0)now=0;
				if(now>=9){
					System.out.println(i+1);
					break;
				}
			}

		}
	}
}