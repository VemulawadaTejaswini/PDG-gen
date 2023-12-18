import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        
        String str1 = scan.next();
        String str2 = scan.next();
        
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);
        
        if (x * y % 2 == 0)
        
            System.out.println("Even");
        
        else
        
            System.out.println("Odd");
    }
}
