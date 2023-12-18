import java.io.*; import java.util.*;
public class Main {
    static ArrayList<Long> arl;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long N=2*Long.parseLong(br.readLine());
        arl=new ArrayList<>();
        fact(N);
        int n=arl.size();
        
        long ans=N-1;
        for (int i = 0; i < (1<<n); i++) {//WLOG, n-1 is in the second set
            long A=1;
            for (int j = 0; j < n; j++) {
                if((i&(1<<j))>0){
                    A*=arl.get(j);
                }
            }
            long B=N/A;
            long x=inv(B,A);
            //System.out.println(A+" "+B+" "+x);
            if(x*B>1){
                ans=Math.min(ans,x*B-1);
            }
            
        }
        System.out.println(ans);
    }
    public static void fact(long i){
        for (int j = 2; j <= Math.sqrt(i); j++) {
            long cur=1;
            while(i%j==0){
                i/=j; cur*=j;
            }
            if(cur>1){
                arl.add(cur);
            }
            
        }
        if(i>1){
            arl.add(i);
        }
    }
    public static long inv(long a, long b){//Computes modular inverse of a mod b
        //Assume b>a and gcd(a,b)=1, 
        if(a==1)return 1;
        long q=b/a;
        long r=b-q*a;
        long y=-inv(r,a);
        return ((b*y+1)/a)+b;
        
    }
}
