import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int q;
        int ans=0;
        q=sc.nextInt();
        int c;
        int l,r,mid;
        while(q>0){
            q--;
            c=sc.nextInt();
            l=-1;r=n-1;
            while(r-l>1){
                mid=(l+r)/2;
                if(a[mid]>=c)r=mid;
                else l=mid;
            }
            if(a[r]==c)ans++;
        }
        System.out.println(ans);
}
}
