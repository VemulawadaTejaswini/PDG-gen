import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		Arrays.parallelPrefix(a,Integer::sum);

		int r=Integer.MAX_VALUE;
		for(int i=0;i<n-1;++i) {
			r=Math.min(r,Math.abs(a[i]-(a[n-1]-a[i])));
		}
		System.out.println(r);
	}
}