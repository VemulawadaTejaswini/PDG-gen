//package Contest077;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int N = sc.nextInt();
            int  M = (int)Math.sqrt(new Double(N));
            out.println(M*M);
        out.flush();
    }
}
