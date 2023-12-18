import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.math.BigInteger; 
public class Main
{
   static Scanner sc=new Scanner(System.in);
    static PrintWriter out=new PrintWriter(System.out);
    static void pn(Object o)
     {
    out.println(o);
    out.flush();
    
    }
    static void p(Object o)
    {
    out.print(o);
    out.flush();
    }
    static void pni(Object o)
    {
    out.println(o);System.out.flush();
    }
        static int I() throws IOException
    { 
    return sc.nextInt();
    }
    static long L()throws IOException
    {
    return sc.nextLong();
    }
    static double D()throws IOException
    {
    return sc.nextDouble();
    }
    static String S()throws IOException
    {
    return sc.next();
        }
    static void process() throws IOException
    {
        int N=I();
        int X=I();
        int T=I();
        long s=N/X;
        if(N%X==0)
        {
            
        pn(s);
    }
    else
    pn(s+1);
    }
    public static void main(String[] args) throws IOException
{
   try
{
        process();
 }
catch(Exception e)
{
return;
}
}
             
         
       }
   