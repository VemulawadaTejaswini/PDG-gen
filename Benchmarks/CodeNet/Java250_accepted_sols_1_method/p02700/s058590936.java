import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        boolean flg = false;
        while (true) {
            
            C = C - B;
            if (C <= 0) {
                flg = true;
                break;
            }
            
            A = A - D;
            if (A <= 0) {
                break;
            } 
        }
        
        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
