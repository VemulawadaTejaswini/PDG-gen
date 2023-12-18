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
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a+b)==c || (a+c)==b || (b+c)==a)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}