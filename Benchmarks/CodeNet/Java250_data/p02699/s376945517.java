import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int sh=Integer.parseInt(s[0]),w=Integer.parseInt(s[1]);
        if(sh<=w) System.out.print("unsafe");
        else System.out.print("safe");
    }
}
