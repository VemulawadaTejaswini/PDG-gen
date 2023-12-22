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
            int K=in.nextInt();
            in.nextLine();
            String str=in.nextLine();
            if(str.length()<=K)
            {
                System.out.println(str);
            }
            else
            {
                System.out.println(str.substring(0, K)+"...");
            }

        }   
        in.close();
    }

}