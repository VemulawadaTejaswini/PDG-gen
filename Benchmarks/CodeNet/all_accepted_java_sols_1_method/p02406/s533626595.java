import java.util.*;
import java.lang.*;

public class Main{
    
    static int i = 1;
    static int n;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        while (i <= n) {
            int x = i;
            if (x % 3 == 0) {
                System.out.print(" " + i);
            } else {
                while (x % 10 != 3) {
                    x /= 10;
                    if (x == 0) {
                        break;
                    }
                }
                if (x % 10 == 3) {
                    System.out.print(" " + i);
                }
            }
            i++;
        }
        System.out.println();
    }
}
