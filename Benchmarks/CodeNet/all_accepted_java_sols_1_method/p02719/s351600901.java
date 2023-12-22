import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ips = br.readLine().split(" ");
        long n = Long.parseLong(ips[0]);
        long k = Long.parseLong(ips[1]);
        if(n >= k)
            n %= k;
        long res = Math.min(n, k-n);
        System.out.println(res);
    }
}