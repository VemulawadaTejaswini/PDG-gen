
import java.io.*;
        import java.util.Scanner;

public class Main{
    public static void main(String []args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        int  c = sc.nextInt();
        int x = b/a;
        if(x>c)
            System.out.println(c);
        else
            System.out.println(x);

    }
}