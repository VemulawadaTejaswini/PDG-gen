import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int a=Integer.parseInt(bu.readLine());
        System.out.print(a+a*a+a*a*a);
    }
}
