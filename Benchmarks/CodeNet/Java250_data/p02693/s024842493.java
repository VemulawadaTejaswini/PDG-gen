import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int i = 0;
        int j = 0;
        boolean flg = true;
        
        while (true) {
            j = K * i;
            i++;
            if ( B < j ) {
                flg = false;
                break;
            } else if ( A <= j && j <= B ) {
                break;
            }
        }
        
        if (flg) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        
    }
}
