import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int k = 0;
        char[] c = Integer.toString(n).toCharArray();
        for(char t : c) {
        	k += t - '0';
        }
        if(n % k > 0) {
        	System.out.println("No");
        }else {
        	System.out.println("Yes");
        }
    }
}