import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        
        System.out.printf("%.5f %.5f\n", Math.PI * r * r, 2 * Math.PI * r);
        
    }
}
