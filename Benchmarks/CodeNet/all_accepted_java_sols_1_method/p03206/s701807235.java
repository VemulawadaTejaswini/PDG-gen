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
        int d = Integer.parseInt(br.readLine());
        
        if (d == 25) {
            System.out.println("Christmas");
        }
        if (d == 24) {
            System.out.println("Christmas Eve");
        }
        if (d == 23) {
            System.out.println("Christmas Eve Eve");
        }
        if (d == 22) {
            System.out.println("Christmas Eve Eve Eve");
        }
        
    }
}
