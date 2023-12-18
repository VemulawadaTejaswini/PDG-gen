//package Contest091;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(a+b >= c)
                out.println("Yes");
            else
                out.println("No");

        out.flush();
    }
}
