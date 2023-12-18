import java.io.*;
import java.math.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,a[]=new int[n],c[]=new int[n];
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i])-1;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        c[i]=Integer.parseInt(s[i]);
        BigInteger max=new BigInteger("-100000000000000000000000000");
        for(i=0;i<n;i++)
        {
            long cur=0;
            BigInteger tot=new BigInteger("0"); int p=a[i],l=1;
            tot=tot.add(tot.valueOf(c[i]));
            while(p!=i)
            {
                tot=tot.add(tot.valueOf(c[p]));
                p=a[p];
                l++;
            }
            int m=k%l,tur=k/l;
            if(k%l==0 && tur!=0) {m=l; tur--;}
            tot=tot.multiply(tot.valueOf(tur));

            p=a[i];
            while(m!=0)
            {
                cur+=c[p];
                p=a[p];
                m--;
                max=max.max(max.valueOf(cur));
                max=max.max(tot.add(tot.valueOf(cur)));
            }
            //System.out.println(cur);
        }
        System.out.print(max);
    }
}