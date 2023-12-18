import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),N=300000+1;
        st=new int[N*4];
        int a[]=new int[N],b,i;
        for(i=0;i<n;i++)
        {
            b=Integer.parseInt(bu.readLine());
            int l=Math.max(b-k,0),r=Math.min(b+k,N-1);
            int m=max(0,N-1,l,r,0)+1;
            updateValue(a,0,N-1,b,m,0);
        }
        int ans=0;
        for(i=0;i<N;i++)
        ans=Math.max(ans,a[i]);
        System.out.print(ans);
    }

    static int st[];
    static int max(int ss,int se,int l,int r,int i)
    {
        if(l<=ss && r>=se) return st[i];
        if(se<l || ss>r) return -1;
        int mid=ss+(se-ss)/2;
        return Math.max(max(ss,mid,l,r,2*i+1),max(mid+1,se,l,r,2*i+2));
    }

    static void updateValue(int a[],int ss,int se,int i,int v,int n)
    {
        if(ss==se)
        {
            a[i]=v;
            st[n]=v;
        }
        else
        {
            int mid=ss+(se-ss)/2;
            if(i>=ss && i<=mid) updateValue(a,ss,mid,i,v,2*n+1);
            else updateValue(a,mid+1,se,i,v,2*n+2);
            st[n]=Math.max(st[2*n+1],st[2*n+2]);
        }
    }
}
