import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1],b=new int[n];
        for(int i=0;i<n+1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        long ans=0;
        int tmp;
        for(int i=0;i<n;i++){
            tmp=Math.min(a[i],b[i]);
            a[i]-=tmp;
            b[i]-=tmp;
            ans+=tmp;
            tmp=Math.min(a[i+1],b[i]);
            a[i+1]-=tmp;
            ans+=tmp;
        }
        System.out.println(ans);
        
    }
    
    
}