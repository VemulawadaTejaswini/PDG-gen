import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        if(A == B) System.out.println(C);
        if(A == C) System.out.println(B);
        if(B == C) System.out.println(A);
    }
}
