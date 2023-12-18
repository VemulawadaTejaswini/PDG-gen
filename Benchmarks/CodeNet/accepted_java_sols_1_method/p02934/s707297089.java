import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		double r=0;
		int n=s.nextInt();
		for(int i=0;i<n;++i) {
			r+=1.0/s.nextInt();
		}
		System.out.println(1/r);
	}
}
