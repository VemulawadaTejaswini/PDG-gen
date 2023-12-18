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
        int n = in.nextInt();
        long a = in.nextLong();
        int b = in.nextInt();
        long cur = in.nextLong();
        long c = 0;long dif;
        for(int i =1;i<n;i++){
            long next = in.nextLong();
            dif = next-cur;
            cur = next;
            c+= Math.min(b,dif*a);
        }
        System.out.println(c);

    }
}
