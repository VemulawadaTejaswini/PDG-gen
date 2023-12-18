import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		int[]a=new int[11];
		while(true){
			int n=s.nextInt();
			if(n==0)
				return;
			int r=0;
			for(int i=0;i*i<n;++i) {
				for(int j=i;i*i+j*j<n;++j) {
					for(int k=j;i*i+j*j+k*k<n;++k) {
						for(int l=k;i*i+j*j+k*k+l*l<=n;++l) {
							if(i*i+j*j+k*k+l*l==n) {
								++r;
								break;
							}
						}
					}
				}
			}
			System.out.println(r);
		}
	}
}
