
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        int currTop = 0;
        long steps = 0;
        
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt(); 
            
            if (A < currTop) {
                steps += currTop - A;
            } else if (currTop < A) {
                currTop = A;
            }
        }
        
        System.out.println(steps);
    }
}
