import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),i,a[]=new int[n],t[]=new int[n];
        s=bu.readLine().split(" ");
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            ArrayList<Integer> temp=new ArrayList<>();
            al.add(temp);
        }
        for(i=0;i<m;i++)
        {
            s=bu.readLine().split(" ");
            int l=Integer.parseInt(s[0])-1,r=Integer.parseInt(s[1])-1;
            t[l]++; t[r]++;
            if(a[l]>a[r]) al.get(l).add(r);
            else if(a[l]<a[r]) al.get(r).add(l);
        }
        int c=0;
        for(i=0;i<n;i++)
            if(al.get(i).size()==t[i]) c++;
        System.out.print(c);
    }
}
