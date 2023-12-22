import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        
        if (S <= W) {
           System.out.println("unsafe"); 
        } else {
            System.out.println("safe"); 
        }
    }
}
