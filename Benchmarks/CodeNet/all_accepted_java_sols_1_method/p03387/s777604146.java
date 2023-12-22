import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int sum = 0;
        if( A % 2 != B % 2 || B % 2 != C % 2 ) {
            if( A % 2 != B % 2 && B % 2 == C % 2 ) {
                B++;
                C++;
            } else if( A % 2 != B % 2 && A % 2 == C % 2 ) {
                A++;
                C++;
            } else if( A % 2 == B % 2 && B % 2 != C % 2 ) {
                A++;
                B++;
            }
            sum++;
        }
        
        int max = Math.max(A, Math.max(B, C));
        sum += (max - A) / 2;
        sum += (max - B) / 2;
        sum += (max - C) / 2;
        
        System.out.println( sum );
    }
}
