import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String s = br.readLine();
        int x = Integer.parseInt(s);
        //sum = x * x * x;
        //Math.pow(a, b);
        sum = (int)Math.pow(x, 3.0);
        System.out.println(sum);
    }
}