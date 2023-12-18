import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		int i,k,cnt=0,ans=0,max,t;
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		max=a[N-1];
		i=0;
		for(;;) {
			cnt=0;
			t=a[i];
			for(k=i;k<N;k++) {
				if(cnt>0 && t!=a[k]) break;
				if(t==a[k]) {
					cnt++;
					i++;
				}
			}
			if(cnt>=t)ans+=cnt-t;
			else ans+=cnt;
			if(t==max)break;
		}
		System.out.println(ans);
	}
}
