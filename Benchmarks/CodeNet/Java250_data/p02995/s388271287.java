import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
		long lc=0,rc=0,sumc=0,ld=0,rd=0,sumd=0,lcd=0,rcd=0,sumcd=0,res=0;
		long lcm=0;
		if(c<d)lcm=LCM(c,d);
		else lcm=LCM(d,c);

		lc=(a-1)/c;
		rc=b/c;
		sumc=rc-lc;

		ld=(a-1)/d;
		rd=b/d;
		sumd=rd-ld;

		lcd=(a-1)/lcm;
		rcd=b/lcm;
		sumcd=rcd-lcd;

		res=sumc+sumd-sumcd;
		System.out.println((b-a+1)-res);
	//	System.out.println(sumc+" "+sumd+" "+sumcd+" "+res);
	//	System.out.println(lc+" "+rc+" "+ld+" "+rd+" "+lcd+" "+rcd);
	}
	/*min,maxの最大公約数を求める。引数の大小は気を付ける*/
	public static long GCD(long min,long max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}
	/*min,maxの最小公倍数を求める。GCDとセットで使うように。引数の大小は気を付ける*/
	public static long LCM(long min,long max) {
		return (min*max)/GCD(min,max);
	}
}

