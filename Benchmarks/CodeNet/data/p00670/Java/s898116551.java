import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n==0 && s==0) break;
			int[] a = new int[101];
			int[] b = new int[102];
			for(int i=0;i<n;i++) a[sc.nextInt()]++;
			for(int j=100;j>0;j--) b[j] = b[j+1] + a[j];
			
			int cnt = 0;
			int len = s/2 + 1;
			for(int i=1;i<len;i++) cnt += b[s-i+1] * a[i];
			if(s%2==1){
				cnt += b[len+1] * a[len];
				cnt += (a[len]*(a[len]-1))/2;
			}
			
			System.out.println(cnt);
		}
	}

}