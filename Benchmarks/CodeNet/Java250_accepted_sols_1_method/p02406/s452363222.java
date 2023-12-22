import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int x = i;
            if (x % 3 == 0) {
                System.out.printf(" %d", i);
                continue;
            }
            while (x > 0) {
                boolean endFlag = false;
                if (x % 10 == 3) {
                    System.out.printf(" %d", i);
                    endFlag = true;
                }
                if (endFlag) break;
                x /= 10;
            }
        }
    	System.out.printf("\n");           
    }
}