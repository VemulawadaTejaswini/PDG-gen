import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double X = x2 - x1;
        double Y = y2 - y1;
        
        double S = Math.sqrt(X*X + Y*Y);
        
        System.out.println(S);
            
        sc.close();
    }
}
