import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int maxA = 0, maxB = 0, minA = 0, minB = 0;
        
        for(int i = 0; i < N; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            
            if(i == 0) {
                maxA = A;
                minA = A;
                maxB = B;
                minB = B;
            } else {
                if(B > maxB) {
                    maxA = A;
                    maxB = B;
                }
                if(B < minB) {
                    minA = A;
                    minB = B;
                }
            }
        }
        int count = minA;
        for(int i = minB; i > 0; i--) count++;
        
        System.out.println(count);
    }
}
