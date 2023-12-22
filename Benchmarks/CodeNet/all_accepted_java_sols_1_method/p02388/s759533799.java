import java.io.*;
 
public class Main
{
    public static void main(String[] args) throws IOException
    {
        String s;
        int a;
        int b;
        BufferedReader buf = new BufferedReader (new InputStreamReader(System.in));
        s=buf.readLine();
        a=Integer.parseInt(s);
        b=a*a*a;
        System.out.println(b);
    }
}