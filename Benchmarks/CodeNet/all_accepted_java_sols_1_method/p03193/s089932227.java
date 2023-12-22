import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nhw = br.readLine().split(" ");
        int n = Integer.parseInt(nhw[0]);
        int h = Integer.parseInt(nhw[1]);
        int w = Integer.parseInt(nhw[2]);
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            if (a >= h && b >= w) count++;
        }
        
        System.out.println(count);
    }
}
