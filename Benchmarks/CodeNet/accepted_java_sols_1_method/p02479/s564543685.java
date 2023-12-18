import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        double area = r * r * 3.141592653589;
        double circumference = 2 * r * 3.141592653589;
            
        System.out.printf("%.6f %.6f\n",area,circumference);                        
    }
}