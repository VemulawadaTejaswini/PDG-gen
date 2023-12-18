import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n,m,ans;
        n=sc.nextInt();
        m=sc.nextInt();
        
            ans=m*(m-1)/2;
            ans+=n*(n-1)/2;

        System.out.println(ans);
        sc.close();
    }
}