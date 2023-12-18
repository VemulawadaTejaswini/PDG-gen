import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        double a= sc.nextInt();
        double b= sc.nextInt();
 
        int d = (int)(a / b);
        int r = (int)(a % b);
        double f = a / b;
        
        
        System.out.println(d +" " + r +" "+(String.format("%.5f", f)));
        
        
    }
}


