import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        
        if(alpha.equals(alpha.toUpperCase())){
            System.out.println("A");
        } else {
        System.out.println("a");
        }
    }
}
