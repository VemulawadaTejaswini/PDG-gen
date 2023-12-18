import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        
            
        for(int crane = 0 ; crane <= 100 ; crane++) {
            for(int turtle = 0 ; turtle <= 100 ; turtle++ ) {
                if((crane+turtle == x) && (crane*2 + turtle*4 == y)) {
                                 System.out.println("Yes");
                                 return;
                }
            }
        }
            System.out.println("No");
    }
    
}