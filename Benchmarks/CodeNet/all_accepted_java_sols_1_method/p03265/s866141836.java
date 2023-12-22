import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2;
        int y3 = y2;
        int x4 = 0;
        int y4 = 0;
        
        int xdiff = x2 - x1;
        int ydiff = y2 - y1;
        
            x3 -= ydiff;
            y3 += xdiff;
            x4 = x3 - xdiff;
            y4 = y3 - ydiff;
            
            System.out.println(x3+ " "+y3+" "+x4+" "+y4);
        

    }
}
