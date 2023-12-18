import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        int []a=new int[n-1];
        int []b=new int[n];
        b[0]=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
            b[i+1]=a[i];
            ans+=Math.min(b[i],a[i]);
        }
        ans+=b[n-1];
        System.out.println(ans);
    }
}
