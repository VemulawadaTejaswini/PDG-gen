import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if(2*x == w && 2*y == h ) {
        	System.out.println((Double.valueOf(w)*Double.valueOf(h) / Double.valueOf(2))+ " 1");
        } else {
        	System.out.println((Double.valueOf(w)*Double.valueOf(h) / Double.valueOf(2))+ " 0");
        }
    }
    
    
 
}