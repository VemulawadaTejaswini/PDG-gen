import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        
        char c = scan.next().charAt(0);
        
        if (Character.isUpperCase(c)){
            System.out.println("A");
        }
        else{
            System.out.println("a");
        }
    }
}
