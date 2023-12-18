import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long A = scan.nextLong();
        long B = scan.nextLong();
        if(N < 2 && A != B) {
            System.out.println(0);
            return;
        }
        long answer = 0;
        
        if(A < B) answer = (N-2)*(B-A)+1;
        else if(A == B) answer = 1;
        else answer = 0;
        System.out.println(answer);
    }
}
