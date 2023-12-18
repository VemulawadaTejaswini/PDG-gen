import java.util.*;

//https://beta.atcoder.jp/contests/abc104/submissions/2961424
//http://betrue12.hateblo.jp/entry/2018/08/05/230358

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]v=s.next().toCharArray();
		int n=v.length,m=1000000007;
		long a=0,ab=0,abc=0,comb=1;
		for(int i=0;i<n;i++){
			if(v[i]=='C') abc+=ab;
			if(v[i]=='B') ab+=a;
			if(v[i]=='A') a+=comb;
			if(v[i]=='?'){
				abc=3*abc+ab;
				ab=3*ab+a;
				a=3*a+comb;
				comb=3*comb;
			}
			a%=m;
			ab%=m;
			abc%=m;
			comb%=m;
//			System.err.println(comb+" "+a+" "+ab+" "+abc);
		}
		System.out.println(abc);
	}
}
