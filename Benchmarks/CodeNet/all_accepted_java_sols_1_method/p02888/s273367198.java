import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		Arrays.setAll(a,i->s.nextInt()*2);
		Arrays.sort(a);
		System.err.println(Arrays.toString(a));

		long r=0;
		for(int i=0;i<n;++i){
			for(int j=i+1;j<n;++j){
				int R=~Arrays.binarySearch(a,a[i]+a[j]-1)-1;
				r+=R-j;
			}
		}
		System.out.println(r);
	}
}
