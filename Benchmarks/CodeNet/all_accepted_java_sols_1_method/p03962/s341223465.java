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
        int[] count = new int[101];
        count[in.nextInt()]=1;
        count[in.nextInt()]=1;
        count[in.nextInt()]=1;
        int s = 0;
        for(int v:count){
            s+=v;
        }
        System.out.print(s);
    }
}
