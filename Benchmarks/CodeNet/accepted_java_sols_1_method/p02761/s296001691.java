import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] d=new int[n];
		Arrays.fill(d,-1);
		for(int m=s.nextInt();m>0;--m){
			int e=s.nextInt()-1;
			int c=s.nextInt();
			if(n>1&&e+c==0||d[e]>0&&d[e]!=c){
				System.out.println(-1);
				return;
			}
			d[e]=c;
		}
		for(int i=0;i<n;++i)
			if(d[i]<0)
				d[i]=i<1&&n>1?1:0;
		System.out.println(Arrays.toString(d).replaceAll("\\D",""));
	}
}
