import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        long a = scan.nextLong();
        long b = scan.nextLong();
        int n = scan.nextInt();
        int turn = 1;
        
        while(n-- > 0){
            if(turn == 1){
                a >>= 1;
                b += a;
            }
            else{
                b >>= 1;
                a += b;
            }
            turn ^= 1;
        }
        System.out.println(String.format("%d %d",a,b));        
    }
}
