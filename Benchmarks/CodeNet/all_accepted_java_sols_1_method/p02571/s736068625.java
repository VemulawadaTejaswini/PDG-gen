import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int min=Integer.MAX_VALUE;
        char s[]=bu.readLine().toCharArray(),t[]=bu.readLine().toCharArray();
        int i,j,c,n=s.length,m=t.length;
        for(i=0;i<n;i++)
        {
            if(i+m>n) break;
            c=0;
            for(j=0;j<m;j++)
            if(s[i+j]!=t[j]) c++;
            min=Math.min(min,c);
        }
        System.out.print(min);
    }
}
