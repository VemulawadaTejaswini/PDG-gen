import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=0;
		for(int i=1; i<=n; i++){
			if(i%10==0){
				continue;
			}
			int k=10;
			int p=1;
			if(i/10==0){
				ans++;
				while(n/(i*k)>0){
					if(n/(i*k)>1){
						ans+=2*p;
					}else{
						int tt=0;
						if((n%(i*k))%10>=i){
							tt++;
						}
						ans+=2*Math.min(p,(n%(i*k))/10+tt);
					}
					k*=10;
					p*=10;
				}
			}else{
				String s=String.valueOf(i);
				int f=s.charAt(0)-'0';
				int b=s.charAt(s.length()-1)-'0';
				while(n/(b*k)>0){
					if(n/(b*k)>1){
						ans+=p;
					}else{
						int tt=0;
						if((n%(b*k))%10>=f){
							tt++;
						}
						ans+=Math.min(p,(n%(b*k))/10+tt);
					}
					k*=10;
					p*=10;
				}
			}
		}
		System.out.println(ans);
}
}
