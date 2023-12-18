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
            int N=in.nextInt();
            int num=N%10;
            if(num==3)
            {
                System.out.println("bon");
            }
            if(num==0 || num==1 || num==6 || num==8)
            System.out.println("pon");
            else
            System.out.println("hon");


        }   
        in.close();
    }

}