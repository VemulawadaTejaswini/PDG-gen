import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author yoshizaki
 * ABC 159
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        BigDecimal l = new BigDecimal(scanner.nextInt());
        BigDecimal edge = l.divide(new BigDecimal(3), 10, BigDecimal.ROUND_HALF_UP); 
        BigDecimal answer = edge.pow(3);
        System.out.println(answer);
    }
}