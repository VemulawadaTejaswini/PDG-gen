import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int A1= scan.nextInt();
        int A2 = scan.nextInt();
        int A3 = scan.nextInt();
        
        if (A1 + A2 + A3 < 22) {
            System.out.println("win");
        }
        
        else {
           System.out.println("bust");
        } 
    }
}