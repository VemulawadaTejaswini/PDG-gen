import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
 
        double product = 1;
        double limit = (double) Math.pow(10, 18);
 
        for (int i = 1; i <= N; i++) {
            double A_i = scan.nextDouble();
            product = product * A_i;
        }
 
        if (product > limit) {
            System.out.println("-1");
            return;
        } 
        
        else {
            System.out.println(product);
        }
        
    }
 
}