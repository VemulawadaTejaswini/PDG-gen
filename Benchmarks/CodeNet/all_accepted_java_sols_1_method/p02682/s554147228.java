import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();
        String K = scan.next();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
        int k = Integer.parseInt(K);
 
        if (k < a) {
          System.out.println(k);
        }
        else if (k <= a + b) {
          System.out.println(a);
        } else {
          System.out.println(a - (k - (a + b)));
        }
        
        scan.close();
    }
}