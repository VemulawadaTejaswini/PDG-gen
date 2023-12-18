import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        
        if(A > B){
            System.out.println("GREATER");
        } else if(A < B){
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }
        
        sc.close();
        
    }
}
