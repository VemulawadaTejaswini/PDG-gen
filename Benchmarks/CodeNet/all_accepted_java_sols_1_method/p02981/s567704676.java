import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // 電車1人A
        // タクシーN人B
        Scanner scan = new Scanner(System.in);
 
        int num = scan.nextInt();
      int train = scan.nextInt();
      int taxi = scan.nextInt();
      
        
        if (num * train < taxi) { 
            System.out.println(num * train);
        } else if (num * train > taxi) {
            System.out.println(taxi);
        } else {
                      System.out.println(taxi);
        }
          
        
    }
}
