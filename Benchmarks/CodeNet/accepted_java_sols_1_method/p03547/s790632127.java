import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String Y = sc.next();
        char x = X.charAt(0);
        char y = Y.charAt(0);
        sc.close();
        
        if(x < y) {
            System.out.println("<");
        }else if(x > y) {
            System.out.println(">");
        }else{
            System.out.println("=");
        }
    }
}