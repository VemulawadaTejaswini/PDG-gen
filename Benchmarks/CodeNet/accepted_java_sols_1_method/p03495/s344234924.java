import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] a=new int[N];
		int[] data=new int[200000];
		Arrays.fill(data,0);
		int i,A,cnt=0,m,ans=0;
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
			A=a[i];
			data[A]++;
		}
		for(i=0;i<200000;i++) {
			if(data[i]>0)cnt++;
		}
		m=cnt-K;
		Arrays.sort(data);
		for(i=200000-cnt;i<200000-cnt+m;i++) {
			ans+=data[i];
		}
		System.out.println(ans);
	}
}
