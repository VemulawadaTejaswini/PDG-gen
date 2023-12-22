//package Contest087;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int a =sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),x=sc.nextInt();
            int cnt = 0;
            for(int i=0;i<=a;i++)
            {
                for(int j=0;j<=b;j++)
                {
                    for(int k=0;k<=c;k++)
                    {
                        int res = (500*i)+(100*j)+(50*k);
                        if(res==x)
                            cnt++;
                    }
                }
            }
            out.println(cnt);

        out.flush();
    }
}
