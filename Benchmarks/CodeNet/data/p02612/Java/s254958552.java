import java.io.*;
class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        int ans=n-(n/1000)*1000;
        if(ans!=0) ans=1000-ans;
        System.out.print(ans);
    }
}