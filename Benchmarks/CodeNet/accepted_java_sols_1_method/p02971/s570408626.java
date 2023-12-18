import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		ArrayList<Long>a=new ArrayList<>();
		ArrayList<Long>b=new ArrayList<>();
		for(int i=0;i<n;++i) {
			int t=s.nextInt();
			a.add(t*1000000L+i);
			b.add(t*1000000L+i);
		}
		a.sort(null);

		//System.err.println(a);
		//System.err.println(b);

		for(int i=0;i<n;++i) {
			if(b.get(i)%1000000==a.get(n-1)%1000000) {
				System.out.println(a.get(n-2)/1000000);
			}else {
				System.out.println(a.get(n-1)/1000000);
			}
		}
	}
}