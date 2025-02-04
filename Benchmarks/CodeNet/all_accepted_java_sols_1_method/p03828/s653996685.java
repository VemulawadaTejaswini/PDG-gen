import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] x=new int[n+1];
       int[] prime=new int[n+1];
        Arrays.fill(prime,1);
        prime[0]=prime[1]=0;
        for(int i=2;i*i<=n;i++){
            if(prime[i]>0){
                for(int j=2;i*j<=n;j++){ prime[i*j]=0; }
            }
        }
        
        for(int i=2;i<n+1;i++){
            if(prime[i]>0){
                prime[i]=0;
                for(int j=i;j<=n;j*=i){
                    prime[i]+=n/j;
                }
            }
        }for(int i=0;i<n+1;i++){ prime[i]++; }
        
        long sum=1;
        
        for(int i=0;i<n+1;i++){
            sum=(sum%1000000007)*(prime[i]%1000000007);
        }System.out.println(sum%1000000007);
        
        
    }
}