import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        int i,a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]);
        int l=a%n,r=b%n;
        if(l==0 || r==0) System.out.print("OK");
        else
        {
            a=a-l;
            a+=n;
            if(a<b) System.out.print("OK");
            else System.out.print("NG");
        }
    }
}
