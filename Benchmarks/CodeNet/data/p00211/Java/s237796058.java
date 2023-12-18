
import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new E();
	}
	
	class E{
		E(){
			while(sc.hasNext()){
				int N=sc.nextInt();
				if(N==0)	break;
				solve(N);
			}
		}
		void solve(int N){
			int[] d=new int[N],v=new int[N];
			for(int i=0; i<N; i++){
				d[i]=sc.nextInt();
				v[i]=sc.nextInt();
			}
			long vvv=v[0],ddd=d[0];
			for(int i=1; i<N; i++){
				long vv=v[i]*vvv;
				long d1=d[i]*vvv,d2=ddd*v[i];
				long d3=lcm(min(d1,d2),max(d1,d2));
				long gcd=gcd(d3,vv);
				vvv=vv/gcd;
				ddd=d3/gcd;
			}
			for(int i=0; i<N; i++){
				System.out.println(((long)v[i]*ddd/vvv)/(long)d[i]);
			}
		}
		long gcd(long x,long y){
			if(y==0)	return x;
			return gcd(y,x%y);
		}
		long lcm(long x,long y){
			return x/gcd(x,y)*y;
		}
	}

}