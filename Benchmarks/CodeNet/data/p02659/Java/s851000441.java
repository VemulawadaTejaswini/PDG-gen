import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer s = new StringTokenizer(in.readLine());
        
        long a = Long.parseLong(s.nextToken());
        String bS = s.nextToken();
        int bTop = Integer.parseInt(bS.substring(0,1));
        int bBottom = Integer.parseInt(bS.substring(2));
        int c = bTop * 100 + bBottom;
        long result = a * c / 100;

        System.out.println(result);
    }
}