import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int i,j,k,a[]=new int[n],c=0;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);

        for(i=0;i<n;i++)
        for(j=i+1;j<n;j++)
        for(k=j+1;k<n;k++)
        {
            Set<Integer> set=new HashSet<>();
            set.add(a[i]); set.add(a[j]); set.add(a[k]);
            if(set.size()!=3) continue;
            if(possible(a[i],a[j],a[k])) c++;
        }
        System.out.print(c);
    }

    static boolean possible(int a,int b,int c)
    {
        if(a+b>c && b+c>a && a+c>b) return true;
        else return false;
    }
}