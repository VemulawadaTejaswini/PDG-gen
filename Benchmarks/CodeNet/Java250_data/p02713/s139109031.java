import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        long ans=0;


        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                for(int l=1;l<=k;l++){
                    ans+=helper(i,j,l);
                }
            }
        }
        System.out.println(ans);
    }

    private static long helper(int i, int j, int k) {

        long temp=gcd(i,j);
        long ans=gcd(temp,k);
        return ans;
    }

    private static long gcd(long a, long b) {
        if(b==0) return a;
        else
            return gcd(b,a%b);
    }
}
