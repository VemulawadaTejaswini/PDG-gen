import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        double PI = Math.PI;
        double rad_A = 2 * PI / (12 * 60.0) * (H * 60.0 + M);
        double rad_B = 2 * PI / 60.0 * M;

        double rad = rad_A - rad_B;
        if(rad < 0) rad = -rad;
        if(rad > PI) rad = 2 * PI - rad;
        
        double C = Math.sqrt( A*A + B*B - 2*A*B*Math.cos( rad ) );
        System.out.println( C );
    }
}