import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long b[]=new long[n+1];
        for(int i=0;i<=n;i++){
            b[i]=0;
        }
        for(int i=0;i<n;i++){
            b[i+1]=b[i];
            b[i+1]+=a[i];
        }
        long ans=2020202030;
        long min=0;
        for(int i=0;i<n;i++){
            min=Math.abs((b[n]-b[i+1])-(b[i+1]-b[0]));
            if(min<ans) ans=min;
        }
        System.out.println(ans);
    }
}