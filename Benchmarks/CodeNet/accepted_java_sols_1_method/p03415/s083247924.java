import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        String c3 = sc.next();
        
        String[] C = {c1, c2, c3};
        for (int i = 0; i < C.length ;i++) {
            System.out.print(C[i].subSequence(i, i+1));
        }
        System.out.println();
        
    }
    
}