import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int x, y;
        while (input.hasNextInt()) {
            x = input.nextInt();
            y = input.nextInt();
            if (x == 0 && y == 0) break;
            System.out.println(y + " " + x);
        }
    }         
}