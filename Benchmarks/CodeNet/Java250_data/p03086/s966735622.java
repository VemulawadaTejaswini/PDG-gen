import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;
   
public class Main {
	static final long mod = (int)(1e9+7);
	static final int inf=(int)(1e9);
	static final int maxn=(int)(1e5+10);
	static long ksm(long a,long b) {
		long ret=1;
		while(b!=0) {
			if(b%2==1) {
				ret=ret*a%mod;
			}
			b>>=1;
			a=a*a%mod;
		}
		return ret;
	}
	public static void main(String[] args) {
    	Scanner cin=new Scanner(System.in);
    	String s=cin.next();
    	int len=s.length();
    	int cnt=0,ans=0;
    	for(int i=0;i<len;i++) {
    		if(s.charAt(i)=='A'||s.charAt(i)=='C'||s.charAt(i)=='G'||s.charAt(i)=='T') {
    			cnt++;
    		}else {
    			cnt=0;
    		}
    		ans=Math.max(ans, cnt);
    	}
    	System.out.println(ans);
    }
}