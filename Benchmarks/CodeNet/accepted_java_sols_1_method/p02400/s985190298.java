import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double r = scanner.nextDouble();
        
        double area = Math.PI * r * r;
        double around = 2 * Math.PI * r;
        
        String str_area = String.format("%.5f", area);
        String str_around = String.format("%.5f", around);
        
        System.out.println(str_area + " " + str_around);

        
    }

}
