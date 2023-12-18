import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[4];
        int[] y = new int[4];
        
        x[0] = sc.nextInt();
        y[0] = sc.nextInt();
        x[1] = sc.nextInt();
        y[1] = sc.nextInt();
        
        int dx = x[1] - x[0];
        int dy = y[1] - y[0];
        
        x[2] = x[1] - dy;
        y[2] = y[1] + dx;
        x[3] = x[0] - dy;
        y[3] = y[0] + dx;
        
        System.out.println( x[2] + " " + y[2] + " " + x[3] + " " + y[3] );
        
    }
}
