import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();

        double a = (r*r)*(Math.PI);
        double c = 2*r*(Math.PI);
        
        System.out.println(String.format("%.6f", a)+" "+ (String.format("%.6f", c)));
        
        
    }
}



