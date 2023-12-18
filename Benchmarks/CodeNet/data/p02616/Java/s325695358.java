import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long mod=1000000007;
		ArrayList<Integer> plus=new ArrayList<>();
		ArrayList<Integer> main=new ArrayList<>();
		int[] a=new int[n];
		int zero=0;
		long ans=1;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(a[i]>0){
				plus.add(a[i]);
			}else if(a[i]<0){
				main.add(-a[i]);
			}else{
				zero++;
			}
		}
		if(n-k<zero){
			System.out.println(0);
			return;
		}else if(n==k){
			for(int i:a){
				ans=(ans*i)%mod;
			}
			if(main.size()%2==1){
				ans=(-ans+mod)%mod;
			}
			System.out.println(ans);
			return;
		}else if(n-k==zero){
			if(main.size()%2==1){
				System.out.println(0);
				return;
			}
			for(int i:plus){
				ans=(ans*i)%mod;
			}
			for(int i:main){
				ans=(ans*i)%mod;
			}
			System.out.println(ans);
			return;
		}
		Collections.sort(plus);
		Collections.sort(main);
		if(main.size()==(n-zero) && k%2==1){
			if(zero>0){
				System.out.println(0);
				return;
			}
			for(int i=0; i<k; i++){
				ans=(ans*main.get(i))%mod;
			}
			System.out.println((-ans+mod)%mod);
			return;
		}
		int maiind=main.size()-1;
		int pluind=plus.size()-1;
		long lastmai=1;
		long lastplu=1;
		for(int i=0; i<k; i++){
			if(maiind<0){
				ans=(ans*lastplu)%mod;
				lastplu=plus.get(pluind--);
			}else if(pluind<0){
				ans=(ans*lastmai)%mod;
				lastmai=main.get(maiind--);
				
			}else{
				if(main.get(maiind)>plus.get(pluind)){
					ans=(ans*lastmai)%mod;
					lastmai=main.get(maiind--);
				}else{
					ans=(ans*lastplu)%mod;
					lastplu=plus.get(pluind--);
				}
			}
		}
		
		if((main.size()-1-maiind)%2==1){
			long max=0;
			if(pluind>=0){
				max=Math.max(max,lastplu*plus.get(pluind));
			}
			if(pluind<plus.size()-1 && maiind>=0){
				max=Math.max(max,lastmai*main.get(maiind));
			}else if(maiind>=0){
				max=plus.get(pluind);
			}
			max%=mod;
			ans=(ans*max)%mod;
		}else{
			ans=(ans*((lastmai*lastplu)%mod))%mod;
		}
		System.out.println(ans);
	}
}
