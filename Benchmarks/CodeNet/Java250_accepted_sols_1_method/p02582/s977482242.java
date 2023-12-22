
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final String S = sc.next();
        
        int n;
        if ("RRR".equals(S)) {
            n = 3;
        } else if ("RRS".equals(S) || "SRR".equals(S)) {
            n = 2;
        } else if (S.contains("R")) {
            n = 1;
        } else {
            n = 0;
        }
        System.out.println(n);
    }
}
