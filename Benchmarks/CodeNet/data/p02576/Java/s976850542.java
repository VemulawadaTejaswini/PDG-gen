import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),x=Integer.parseInt(s[1]),t=Integer.parseInt(s[2]);
        int ans=n/x*t;
        if(n%x==0) n=0;
        else n=1;
        ans+=n*t;
        System.out.print(ans);
    }
}
