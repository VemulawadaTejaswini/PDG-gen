import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            boolean [] prime = new boolean[10000001];
            for(int i=3;i<=10000000;i+=2)prime[i]=true;
            int limit = (int)Math.sqrt(10000000);
            for(int i=3;i<=limit;i+=2){
            	if(prime[i]){
            		for(int j=i*i;j<=10000000;j+=i*2)prime[j]=false;
            	}
            }
            
            while(true){
            	int n= scan.nextInt();
            	if(n==0)break;
            	int ans =13;
               	if(n>=19){
            	for(int i=(n-19)/30;i>=0;i--){
            		if(prime[30*i+11]&&prime[30*i+13]&&prime[30*i+17]&&prime[30*i+19]){
            			ans = 30*i+19;
            			break;
            		}
            	}
               	}
            	System.out.println(ans);
            }
        }
}