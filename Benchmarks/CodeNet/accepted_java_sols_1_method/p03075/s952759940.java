import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        int e = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        
        int a1 = (int)Math.abs(a-b);
        int a2 = (int)Math.abs(a-c);
        int a3 = (int)Math.abs(a-d);
        int a4 = (int)Math.abs(a-e);
        
        int b1 = (int)Math.abs(b-c);
        int b2 = (int)Math.abs(b-d);
        int b3 = (int)Math.abs(b-e);
        
        int c1 = (int)Math.abs(c-d);
        int c2 = (int)Math.abs(c-e);
        
        int d1 = (int)Math.abs(d-e);
        
        if (a1 <= k &&
            a2 <= k &&
            a3 <= k &&
            a4 <= k &&
            b1 <= k &&
            b2 <= k &&
            b3 <= k &&
            c1 <= k &&
            c2 <= k &&
            d1 <= k ) {
                System.out.println("Yay!");
            } else {
                System.out.println(":(");
            }
    }
}
