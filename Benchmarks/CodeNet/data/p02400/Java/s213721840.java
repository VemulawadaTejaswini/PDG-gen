import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double r = scan.nextDouble();
        
        double result =  r * r * Math.PI;
        double result_2 = (r + r) * Math.PI;
        
        System.out.printf("%f %f", result, result_2);
        
    }
}
