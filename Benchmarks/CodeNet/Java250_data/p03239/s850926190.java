import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int limit = scan.nextInt();
        int min = Integer.MAX_VALUE;
        
        while(n-- > 0){
            int cost = scan.nextInt();
            int time = scan.nextInt();
            
            if(time <= limit)
                if(cost < min) min = cost;
        }
        
        if(min == Integer.MAX_VALUE) System.out.println("TLE");
        else System.out.println(min);
    }
}
