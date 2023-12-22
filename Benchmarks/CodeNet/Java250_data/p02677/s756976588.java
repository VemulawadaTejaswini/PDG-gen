import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        
        //短針
        double S = 30*H+0.5*M;  
        //長針
        double L = 6*M;
        
        double angle = Math.abs(L-S);
        
        if(angle>180){
            angle = Math.abs(angle-360);
        }
        
        angle = Math.toRadians(angle);
        
        System.out.println(Math.sqrt(A*A+B*B-2*A*B*Math.cos(angle)));
        
    }
}
