import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int r = Integer.parseInt(s);
        //System.out.println(r);
        String x = String.format("%.6f",(r * r * Math.PI));
        String y = String.format("%.6f",(Math.PI * 2 *r));
        System.out.println(x+" "+y);
    }
}