import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ", 0);
        
        int a = Integer.valueOf(input[0]);
        int b = Integer.valueOf(input[1]);
        int c = Integer.valueOf(input[2]);
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
