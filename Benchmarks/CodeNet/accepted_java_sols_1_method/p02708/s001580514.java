import java.util.*;
public class Main{
    public static int MOD=1000000007;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long N=sc.nextInt();
        long K=sc.nextInt();
        long ans=0;
        for(long i=K;i<=N+1;i++){
            long add=((N+(N+1-i))*i)/2;
            add-=i*(i-1)/2;
            add++;
            ans=(ans+add)%MOD;
        }
        System.out.println(ans);
        sc.close();
    }
}