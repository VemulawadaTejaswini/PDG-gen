import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        for(int i = 1 ; i < x ; i++) {
            if(y == (2*i + 2 *x)) { 
             System.out.println("Yes");
             return;
            }
        }
        
        System.out.println("No");
    }
    
}