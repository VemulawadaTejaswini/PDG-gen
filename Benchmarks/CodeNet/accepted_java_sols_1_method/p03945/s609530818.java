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
        String a = in.next();
        char p = a.charAt(a.length()-1);
        int s =0;
        for(int i = a.length()-2;i>=0;i--){
            if (a.charAt(i)!=p)
                s++;
            p = a.charAt(i);
        }
    System.out.println(s);

    }
}