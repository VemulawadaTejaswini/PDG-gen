import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double xlength_pow = (x1-x2)*(x1-x2);
        double ylength_pow = (y1-y2)*(y1-y2);
        
        double p1p2length = Math.sqrt(xlength_pow + ylength_pow);
        
        System.out.println(String.format("%.8f", p1p2length));
    }
}

