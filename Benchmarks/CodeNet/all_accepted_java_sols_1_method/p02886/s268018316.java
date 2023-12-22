import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		long r=0;
		for(int i=0;i<n;++i)
			for(int j=i+1;j<n;++j)
				r+=a[i]*a[j];
		System.out.println(r);
	}
}
