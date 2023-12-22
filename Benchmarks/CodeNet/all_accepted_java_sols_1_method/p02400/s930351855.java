import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        double x=Math.PI;
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Input real number");
        double num = scanner.nextDouble();
        // System.out.println(x);
        System.out.println(String.format("%.6f",num*num*x) + " " + String.format("%.6f",2*num*x));
        
    }


    
}
