import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    static int count = 0;
    static boolean[] visited;
    static boolean[][] connected;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int cost = Integer.parseInt(br.readLine());
            if (cost == 0) break;
            calculator(cost);
        }
        
        
    }
    
    static int[] coins = {500, 100, 50, 10, 5, 1};
    static void calculator(int cost) {
        int index = 0;
        int count = 0;
        int change = 1000 - cost;
        while (change != 0) {
            if (change - coins[index] >= 0) {
                change -= coins[index];
                count++;
            }
            else {
                index++;
            }
        }
        
        System.out.println(count);
    }
}

