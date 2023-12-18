import java.util.*;
import java.awt.geom.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1167();
	}
	
	class AOJ1167{
		int[] a1,a2,dp1,dp2;
		AOJ1167(){
			initialize();
			while(sc.hasNext()){
				int n=sc.nextInt();
				if(n==0)	break;
				System.out.println(dp1[n]+" "+dp2[n]);
			}
		}
		void initialize(){
			final int MAX=1000000;
			a1=new int[200];
			a2=new int[50];
			for(int i=1,i2=1; true; ++i){
				int tmp=i*(i+1)*(i+2)/6;
				a1[i]=tmp;
				if(tmp%2==1)	a2[i2++]=tmp;
				if(tmp>MAX){
					a1[i+1]=MAX;
					a2[i2+1]=MAX;
					break;
				}
			}
			dp1=new int[MAX];
			dp2=new int[MAX];
			for(int i=1; i<MAX; ++i){
				dp1[i]=MAX;
				dp2[i]=MAX;
			}
			for(int i=1; a1[i]<MAX; ++i)for(int j=0; j<MAX; ++j)	dp1[j]=min(dp1[j], j<a1[i]? dp1[j]: dp1[j-a1[i]]+1);
			for(int i=1; a2[i]<MAX; ++i)for(int j=0; j<MAX; ++j)	dp2[j]=min(dp2[j], j<a2[i]? dp2[j]: dp2[j-a2[i]]+1);
		}
	}
}