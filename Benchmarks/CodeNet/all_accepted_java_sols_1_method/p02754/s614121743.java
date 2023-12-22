import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer s = new StringTokenizer(br.readLine());
        long n = Long.parseLong(s.nextToken());
        long blue = Long.parseLong(s.nextToken());
        long red = Long.parseLong(s.nextToken());
        long periods = n / (blue + red);
        long totalBlue = blue * periods;
        System.out.println(totalBlue + Math.min(n % (blue + red), blue));
    }
}