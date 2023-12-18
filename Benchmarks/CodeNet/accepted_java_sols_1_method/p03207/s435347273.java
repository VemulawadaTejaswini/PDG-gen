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
        int n = Integer.parseInt(br.readLine());
        int[] goods = new int[n];
        int max = 0;
        int max_index = 0;
        
        for (int i = 0; i < n; i++) {
            int price = Integer.parseInt(br.readLine());
            goods[i] = price;
            if (price > max) {
                max = price;
                max_index = i;
            }
        }
        
        goods[max_index] /= 2;
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += goods[i];
        }
        System.out.println(ans);
    }
}
