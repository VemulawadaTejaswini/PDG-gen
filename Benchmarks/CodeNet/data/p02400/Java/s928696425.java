import java.util.Scanner;

public class Main {
    
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        
        double r = Double.parseDouble(number);
        
        System.out.println(String.format("%.6f %.6f", r*r*Math.PI, 2*r*Math.PI));
    }
}
