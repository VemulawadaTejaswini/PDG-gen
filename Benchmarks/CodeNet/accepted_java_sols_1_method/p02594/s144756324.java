import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        String ans="";
        if(n>=30) ans="Yes";
        else ans="No";
        System.out.print(ans);
    }
}