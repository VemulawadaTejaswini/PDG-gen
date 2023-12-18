import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),c=Integer.parseInt(s[2]),d=Integer.parseInt(s[3]);
        int t=0;
        while(a>0 && c>0)
        {
            if(t==1) {a-=d; t=0;}
            else {t=1; c-=b;}
        }
        if(a>0) System.out.print("Yes");
        else System.out.print("No");
    }
}
