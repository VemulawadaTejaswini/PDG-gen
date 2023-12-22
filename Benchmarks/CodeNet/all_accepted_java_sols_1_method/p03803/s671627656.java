import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        String[] s = {"Alice","Bob","Draw"};
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==1)
            a+=100;
        if(b==1)
            b+=100;
        if(a>b)
            System.out.println(s[0]);
        else if(b>a)
            System.out.println(s[1]);
        else
            System.out.println(s[2]);

    }
}
