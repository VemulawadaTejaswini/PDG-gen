import java.util.*;
import java.io.*;
public class Main {
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer s = new StringTokenizer(in.readLine());
        long a = Long.parseLong(s.nextToken());
        double b = Double.parseDouble(s.nextToken());
        long result = (long)(a * b - a*b % 1);
        System.out.println(result);
    }
}