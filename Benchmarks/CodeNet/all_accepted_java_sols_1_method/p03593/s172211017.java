import java.util.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int c[]=new int[26],h=s.nextInt(),w=s.nextInt();
		for(int i=0;i<h;++i)
			s.next().chars().map(o->o-'a').forEach(o->++c[o]);

		int $1=(h%2)*(w%2),$2=(w%2==1?h/2*2:0)+(h%2==1?w/2*2:0),$4=h*w-$1-$2;

		for(int i=0;i<26;++i) {
			while($4>0&&c[i]>=4) {
				$4-=4;
				c[i]-=4;
			}
			while($2>0&&c[i]>=2) {
				$2-=2;
				c[i]-=2;
			}
		}
		for(int i=0;i<26;++i)
			$1-=c[i];
		System.out.println($1==0?"Yes":"No");
	}
}
