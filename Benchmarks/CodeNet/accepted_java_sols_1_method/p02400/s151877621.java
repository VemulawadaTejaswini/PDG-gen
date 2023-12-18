import java.util.Scanner;

public class Main 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Double radius = sc.nextDouble();
        
        Double R = radius * radius * Math.PI;
        Double D = 2 * Math.PI * radius;
        
        System.out.println(String.format("%.6f",R) + " " + String.format("%.6f",D));
        
    }
}
