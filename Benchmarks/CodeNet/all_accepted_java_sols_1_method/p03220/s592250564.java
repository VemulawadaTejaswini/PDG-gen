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
        Integer n = Integer.parseInt(br.readLine());
        String[] ta = br.readLine().split(" ");
        double t = Double.parseDouble(ta[0]);
        double a = Double.parseDouble(ta[1]);
        String[] str_hs = br.readLine().split(" ");
        int[] hs = new int[n];
        for (int i = 0; i < n; i++) {
            hs[i] = Integer.parseInt(str_hs[i]);
        }
        
        double min = 1000000;
        int index = 0;
        for (int i = 0; i < n; i++) {
            double avg = t - hs[i] * 0.006;
            double diff=a-avg;
            
            if (diff <0) diff = -1*diff;
            if (Math.abs(diff) < min) {
                min = diff;//Math.abs(a - avg);
                index = i+1;
            }
        }
        
        
        System.out.println(index);
    }
}
