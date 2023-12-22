import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
                    int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
        double zero = (double)a * a * b / 2;
        if (x < zero) {

            
            double c = (double)2 * x / a / b;   // 2x = a * b * c
            
            
            double tai = Math.sqrt(Math.pow(b, 2)+ Math.pow(c, 2));
            
            double d = c / tai;
            
            System.out.println(Math.toDegrees(Math.acos(d)));
            
        } else {
            int z = a*a*b - x;
            
            double c = (double) 2 * z / a / a;
            
            // a *a *c = 2z
            
            double tai = Math.sqrt(Math.pow(a, 2)+ Math.pow(c, 2));
            
            double d = a / tai;
            System.out.println(Math.toDegrees(Math.acos(d)));
        }
    }
}
