import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int r = Integer.parseInt(s);
        System.out.println(r);
        String x = String.format("%.6f",(r * r * 3.14159265359));
        String y = String.format("%.6f",(3.14159265359 * 2 *r));
        System.out.println(x+" "+y);
    }
}