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
        long n = in.nextLong();
        if (n<7){
            System.out.println(1);
        }
        else {
            long mul = (long)(n/11);
            long cur = 2 *mul;
            long value = mul*11;
            while (value<n){
                value+=6;
                cur++;
                if (value<n){
                    value+=5;
                    cur++;
                }

            }
            System.out.println(cur);
        }
    }
}
