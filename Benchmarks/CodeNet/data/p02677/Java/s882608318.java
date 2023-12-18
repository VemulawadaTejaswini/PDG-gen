import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);

        int T;
        T=1;
        while((T--)>0)
        {
            //code comes here
            int A,B,H,M;
            A=in.nextInt();
            B=in.nextInt();
            H=in.nextInt();
            M=in.nextInt();
            double Hangle=H*30.0;
            double Mangle=M*6.0;
            double diff=Math.abs((Hangle-Mangle));
            if(diff>180.0)
            {
                diff=360-diff;
            }
            System.out.println(diff);
            double ans=Math.sqrt((A*A)+(B*B)-2*A*B*Math.cos(Math.toRadians(diff)));
            System.out.println(ans);

        }   
        in.close();
    }

}