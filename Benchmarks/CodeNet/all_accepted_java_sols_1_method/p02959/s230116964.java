import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n+1];
        int []b=new int[n];
        long ans2=0;
        for(int i=0;i<=n;i++){
            a[i]=sc.nextInt();
            ans2+=a[i];
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int po=Math.max(a[i]-b[i],0);
            b[i]=Math.max(b[i]-a[i],0);
            a[i]=po;
            a[i+1]=Math.max(a[i+1]-b[i],0);
        }
        long ans=0;
        for(int i=0;i<n+1;i++){
            ans+=a[i];
        }
        System.out.println(ans2-ans);
    }
}
