import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextLong(),n=sc.nextLong(),ans=m;
        for(long i=1;i<n;i++){
            ans*=m;
            if(ans>=1000000007) ans%=1000000007;
        }
        System.out.println(ans);
    }
}

