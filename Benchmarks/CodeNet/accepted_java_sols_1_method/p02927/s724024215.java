import java.util.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int m=s.nextInt(),d=s.nextInt();

		int r=0;
		for(int i=1;i<=m;++i) {
			for(int j=10;j<=d;++j) {
				if(j%10>=2&&j/10>=2&&(j%10)*(j/10)==i)
					++r;
			}
		}
		System.out.println(r);
	}
}
