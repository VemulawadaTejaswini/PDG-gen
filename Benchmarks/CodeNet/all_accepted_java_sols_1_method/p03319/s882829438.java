import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int p = 0;
		while(sc.nextInt()!=1) p++;
		int left = Math.max(0,p-K+1);
		int ans = Integer.MAX_VALUE;
		for(int i=left;i<=p;++i){
			int times = 1;
			times += (int)Math.ceil((double)i/(double)(K-1));
			if(i+K-1 < N-1) times += (int)Math.ceil((double)(N-i-K)/(double)(K-1));
			ans = Math.min(ans,times);
		}
		System.out.println(ans);
		return;
	}
}