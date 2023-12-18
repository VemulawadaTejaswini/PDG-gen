
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final long X = Math.abs(sc.nextLong());
        final long K = sc.nextLong();
        final long D = sc.nextLong();
        
        long steps = (X + D / 2) / D;
        
        if (K < steps) {
            System.out.println(Math.abs(X - D * K));
            
        } else if ((K -steps) % 2 == 0) {
            System.out.println(Math.abs(X - D * steps));
            
        } else {
            System.out.println(- Math.abs(X - D * steps) + D);
            
        }
    }
}
