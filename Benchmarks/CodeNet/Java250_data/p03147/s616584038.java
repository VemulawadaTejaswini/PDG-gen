import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] h = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(s[i]);
        }
        
        int count = 0;
        boolean end = true; 
        boolean toCount = false;
        while (true) {
            end = true;
            for (int i = 0; i < n; i++) {
                if (h[i] != 0) {
                    end = false;
                    break;
                }
            }
            
            if (end) {
                break;
            }
            
            
            toCount = false;
            for (int i = 0; i < n; i++) {
                if (h[i] > 0) {
                    h[i]--;
                    toCount = true;
                }
                else {
                    if (toCount) count++;
                    toCount = false;
                    continue;
                }
            }
            if (toCount) count++;
        }
        
        System.out.println(count);
    }
}

