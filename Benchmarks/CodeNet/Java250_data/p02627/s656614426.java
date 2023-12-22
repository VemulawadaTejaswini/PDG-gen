import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        
        if (alpha.toUpperCase().equals(alpha)) {
             System.out.println("A");
        } else {
            System.out.println("a");
        }
       
    }
}
