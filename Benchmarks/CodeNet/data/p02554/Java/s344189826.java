import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.println(0);
            return ;
        }
        long ans=pow(10,n)-pow(9,n)-pow(9,n)+pow(8,n);
        ans+=mod;
        ans%=mod;
        System.out.println(ans);

    }
    public static long pow(int a,int b){
        long ans=1;
        for(int i=0;i<b;i++){
            ans*=a;
            ans%=mod;
        }
        return ans;
    }

}