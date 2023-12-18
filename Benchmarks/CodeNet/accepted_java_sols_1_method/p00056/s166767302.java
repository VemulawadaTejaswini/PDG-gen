import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        boolean [] prime = new boolean[50000];
	        
	        for(int i=2;i<prime.length;i++)prime[i]=true;
	        for(int i=2;i<=Math.sqrt(prime.length-1);i++){
	        	if(prime[i]){
	        		for(int j=i*2;j<=prime.length-1;j+=i)prime[j]=false;
	        	}
	        }
	        
	        while(true){
	        	int k=scan.nextInt();
	        	if(k==0)break;
	        	int ans=0;
	        	for(int i=2;i<k;i++){
	        		if(prime[i]&&prime[k-i])ans++;
	        	
	        	}
	        	if(ans!=1)ans=(ans+1)/2;
	        	System.out.println(ans);
	        }
	    }
}
	    