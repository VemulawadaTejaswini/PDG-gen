import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine()),f=0,l=0,i;
        char s[]=bu.readLine().toCharArray();
        for(i=0;i<n;i++)
        if(s[i]!='R') break;
        else f++;
        for(i=n-1;i>=0;i--)
        if(s[i]!='W') break;
        else l++;
        if(f+l==n) {System.out.print(0); return;}

        l=n-1-l;
        int r=0,w=0;
        for(i=f;i<=l;i++)
        if(s[i]=='R') r++;
        for(i=f;i<f+r;i++)
        if(s[i]=='W') w++;
        System.out.print(w);
    }
}