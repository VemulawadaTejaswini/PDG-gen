import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		int r=0;
		for(int i=1;i<n-1;++i) {
			if(a[i-1]>a[i]&&a[i]>a[i+1])
				++r;
			if(a[i-1]<a[i]&&a[i]<a[i+1])
				++r;
		}
		System.out.println(r);
	}
}
