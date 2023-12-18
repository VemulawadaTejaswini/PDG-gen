import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
     int A = sc.nextInt();
     int B = sc.nextInt();
     int H = sc.nextInt();
     int M = sc.nextInt();
     
     double rad = 2*Math.PI*(H+M/60.0)/12-2*Math.PI*M/60; 
     double C = Math.sqrt(A*A+B*B-2*A*B*Math.cos(rad));
     
     System.out.println(C);
     }
    
}
