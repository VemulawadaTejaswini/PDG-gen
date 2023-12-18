import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double r = sc.nextDouble();
            
            double x = r * r * 3.141592653589;
            double y = 2 * r * 3.141592653589;
            System.out.println((String.format("%.6f", x)) + " " + (String.format("%.6f", y)));
            
    }
}
