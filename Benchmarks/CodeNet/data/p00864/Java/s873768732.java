import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		int[]a=new int[11];
		while(true){
			int n=s.nextInt();
			if(n==0)
				return;
			int w=s.nextInt();
			
			Arrays.fill(a,0);
			
			int len=0;
			for(int i=0;i<n;++i) {
				int v=s.nextInt()/w;
				len=Math.max(len,v);
				++a[v];
			}
			
			int h=Arrays.stream(a).max().getAsInt();
			
			double r=0;
			for(int i=0;i<=len;++i)
				r+=a[i]*(len-i);
			
			System.out.println(r/len/h+0.01);
		}
	}
}
