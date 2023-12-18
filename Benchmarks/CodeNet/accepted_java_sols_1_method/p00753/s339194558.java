import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        int max_2n=123456*2;
	        boolean [] prime = new boolean [max_2n+1];
	        for(int i=3;i<=max_2n;i+=2)prime[i]=true;
	        prime[2]=true;
	        int limit = (int)Math.sqrt(max_2n);
	        for(int i=3;i<=limit;i+=2){
	        	if(prime[i]){
	        		for(int j=i*i;j<=max_2n;j+=i*2)prime[j]=false;
	        	}
	        }
	        
	        while(true){
	        	int n=scan.nextInt();
	        	if(n==0)break;
	        	int ans=0;
	        	for(int i=n+1;i<=2*n;i++)
	        		if(prime[i])ans++;
	        	System.out.println(ans);
	        }
	  
	        }
	     
}