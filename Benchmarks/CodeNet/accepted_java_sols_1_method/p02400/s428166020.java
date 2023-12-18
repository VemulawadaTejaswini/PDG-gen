import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double r;
        
        double b;
        double c;
        
        
        r = sc.nextDouble();
        
        
        b = r*r*3.141592653589;
        c = 2.0*3.141592653589*r;
        
        System.out.println(String.format("%.6f",b) + " " + String.format("%.6f",c));
        
    }
}

