import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int r= scan.nextInt();
        double circ= 2*Math.PI*r;
        System.out.println(circ);
    }
}
