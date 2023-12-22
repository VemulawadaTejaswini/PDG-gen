import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        long ans=0;
        long min=0;
        long max=0;
        
        for(int i=0;i<K;i++){
            min+=i;
            max+=N-i;
        }
        
        for(int i=K;i<=N+1;i++){
            ans+=max-min+1;
            ans=ans%1000000007;
            min+=i;
            max+=N-i;
        }
        
        System.out.println(ans);
    }
}
