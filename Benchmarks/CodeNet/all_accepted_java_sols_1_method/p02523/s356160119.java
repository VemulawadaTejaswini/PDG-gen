import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double p1x = scanner.nextDouble();
        double p1y = scanner.nextDouble();
        double p2x = scanner.nextDouble();
        double p2y = scanner.nextDouble();
        
        double distance = Math.sqrt( Math.pow(p1x-p2x,2) + Math.pow(p1y-p2y,2) );
        
        System.out.println(distance);
        
    }
}