import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double[] x={scan.nextDouble()};
        
        System.out.println(String.format("%f", x[0]*x[0]*Math.PI)+" "+String.format("%f", 2*x[0]*Math.PI));
    }
}
