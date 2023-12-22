import java.util.*;

public class Main {
    
    
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        if(c - (a - b) >= 0) {
            System.out.println(c - (a - b));
        }else {
            System.out.println(0);
        }
    }
    
}