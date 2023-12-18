import java.util.*;

public class Main{
	public static int ppow(int a,int b,int MOD) {
		int res=1;
		while(b>=1) {
			if(b%2==1)res=(res*a)%MOD;
			a=(a*a)%MOD;
			b>>=1;
		}
		return res;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int b=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1')b++;
		}
		int sum1=0,sum2=0;
		for(int i=0;i<s.length();i++) {
			if(b>=2) {
				sum1=sum1*2+(s.charAt(i)-'0');
				sum1%=b-1;
			}
			sum2=sum2*2+(s.charAt(i)-'0');
			sum2%=b+1;
		}
		for(int i=0;i<s.length();i++) {
			int S,P;
			if(s.charAt(i)=='0') {
				P=b+1;
				S=(sum2+ppow(2,s.length()-i-1,P))%P;
			}
			else {
				P=b-1;
				if(P==0) {
					System.out.println(0);
					continue;
				}
				S=(sum1+P-ppow(2,s.length()-i-1,P))%P;
			}
			int cnt=1;
			while(S>=1) {
				cnt++;
				S=S%Integer.bitCount(S);
			}
			System.out.println(cnt);
		}
	}
}