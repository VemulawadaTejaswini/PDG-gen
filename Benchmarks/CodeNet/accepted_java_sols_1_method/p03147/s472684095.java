import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int old=0,ans=0;
        int m=0;
        for(int i=0;i<n;i++){
            m=sc.nextInt();
            if(old>m){
                ans+=old-m;
            }
            old=m;
        }
        System.out.println(ans+m);
    }
}
