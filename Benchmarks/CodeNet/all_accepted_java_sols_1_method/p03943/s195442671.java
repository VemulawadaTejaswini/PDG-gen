import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        if (a == (b + c)) {
            System.out.println("Yes");
        }
        
        else if (b == (a + c)) {
            System.out.println("Yes");
        }
        
        else if (c == (a + b)) {
            System.out.println("Yes");
        }
        
        else
           System.out.println("No");
    }     
}
