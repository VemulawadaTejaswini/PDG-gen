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
				ans=(ans*i%mod+mod)%mod;
			}
			System.out.println(ans);
			return;
		}else if(n-k==zero){
			for(int i:plus){
				ans=(ans*i)%mod;
			}
			for(int i:main){
				ans=(-ans*i%mod+mod)%mod;
			}
			ans=Math.max(ans,0);
			System.out.println(ans);
			return;
		}
		Collections.sort(plus);
		Collections.sort(main);
		long[] cplus=new long[plus.size()];
		long[] cmain=new long[main.size()];
		if(plus.size()!=0){
			cplus[plus.size()-1]=plus.get(plus.size()-1);
		}
		for(int i=plus.size()-2; i>=0; i--){
			cplus[i]=cplus[i+1]*plus.get(i)%mod;
		}
		if(main.size()!=0){
			cmain[main.size()-1]=main.get(main.size()-1);
		}
		for(int i=main.size()-2; i>=0; i--){
			cmain[i]=cmain[i+1]*main.get(i)%mod;
		}
		if(cmain.length==n && k%2==1){
			for(int i=0; i<k; i++){
				ans=(ans*main.get(i))%mod;
			}
			System.out.println((-ans+mod)%mod);
			return;
		}
		int i=cmain.length-2;
		if(cplus.length>=k){
			ans=Math.max(ans,cplus[cplus.length-k]);
		}
		for(;i>=0; i-=2){
			if(k-(cmain.length-i)>=0){
				if(k-(cmain.length-i)>0){
					if(k-(cmain.length-i)<=cplus.length){
						ans=Math.max(ans,cmain[i]*cplus[cplus.length-(k-(cmain.length-i))]);
					}
				}else{
					ans=Math.max(ans,cmain[i]);
				
				}
			}
		}
		System.out.println(ans);
	}
}
