import java.util.*;
import java.util.stream.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		char[]t=s.next().toCharArray();
		int n=t.length;
		int[]a=new int[n];
		int[]b=new int[n];
		Arrays.fill(a,1);
		Arrays.fill(b,0);
		for(int i=0;i<n;++i) {
			if(t[i]=='R'&&t[i+1]=='R') {
				a[i+1]+=b[i];
				b[i+1]+=a[i];
				a[i]=0;
				b[i]=0;
			}
		}
		for(int i=n-1;i>=0;--i) {
			if(t[i]=='L'&&t[i-1]=='L') {
				a[i-1]+=b[i];
				b[i-1]+=a[i];
				a[i]=0;
				b[i]=0;
			}
		}

		for(int i=0;i<n;++i) {
			if(t[i]=='R'&&t[i+1]!='R') {
				a[i+1]+=b[i];
			}
		}
		for(int i=n-1;i>=0;--i) {
			if(t[i]=='L'&&t[i-1]!='L') {
				a[i-1]+=b[i];
			}
		}

		System.out.println(Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
	}
}
