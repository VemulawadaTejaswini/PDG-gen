import java.lang.*;
import java.lang.Number.*;
import java.math.*;
import java.util.*;

class RealNumber{ // a/b
    public BigInteger a;
    public BigInteger b;
    public RealNumber(BigInteger aa, BigInteger bb){
	a = aa;
	b = bb;
    }
    public RealNumber(String sa, String sb){
	a = new BigInteger(sa);
	b = new BigInteger(sb);
    }
    public void add(RealNumber r){
	BigInteger G=b.gcd(r.b);
	BigInteger tmpb=b.multiply(r.b.divide(G));
	a=a.multiply(r.b.divide(G)).add(r.a.multiply(b.divide(G)));
	b=tmpb;
    }
    public BigDecimal toBigDecimal(int r){
	BigDecimal ret = new BigDecimal(a);
	ret = ret.divide(new BigDecimal(b),r,BigDecimal.ROUND_DOWN);
	return ret;
    }
    public void out(){
	System.out.println(a+" / " +b);
    }
}

class Main{
    public static void main(String  []s ){
	Scanner sc = new Scanner(System.in);
	RealNumber table[] = new RealNumber[10001];
	RealNumber R = new RealNumber(new BigInteger("1"),new BigInteger("1"));
	table[1]=R;
	for(int i = 2; i < 10001; ++i){
	    R.add( new RealNumber(Integer.toString(1),Integer.toString(i)) );
	    table[i]=R;
	}
	while(true){
	    int n,k,m,r;
	    BigDecimal ans=new BigDecimal(0);
	    n = sc.nextInt();
	    k = sc.nextInt();
	    m = sc.nextInt();
	    r = sc.nextInt();
	    if(n==0&&k==0&&m==0&&r==0)break;
	    BigDecimal bdn = new BigDecimal(n);
	    if(m == 0){
		ans = BigDecimal.ONE.divide(bdn,r+10,BigDecimal.ROUND_DOWN);
	    }else{
		ans = BigDecimal.ONE.divide(bdn,r+10,BigDecimal.ROUND_DOWN);
		BigDecimal bdtmp = new BigDecimal(table[n-1].a);
		bdtmp = bdtmp.divide( new BigDecimal(table[n-1].b), r+10, BigDecimal.ROUND_DOWN);
		bdtmp = bdtmp.multiply(ans);
		ans = ans.add(bdtmp);
	    }
	    System.out.println( ans.divide(BigDecimal.ONE,r,BigDecimal.ROUND_DOWN) );
	}
    }
}