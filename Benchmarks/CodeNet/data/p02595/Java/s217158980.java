import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),i,c=0; double x,y,d=Double.parseDouble(s[1]);
        for(i=0;i<n;i++)
        {
            s=bu.readLine().split(" ");
            x=Double.parseDouble(s[0]); y=Double.parseDouble(s[1]);
            x=Math.sqrt(x*x+y*y);
            if(x<=d) c++;
        }
        System.out.print(c);
    }
}