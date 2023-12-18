
import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int input = Integer.parseInt(x);

        
        BigDecimal ten = new BigDecimal("10");
        BigDecimal nine = new BigDecimal("9");
        BigDecimal eight = new BigDecimal("8");
        BigDecimal wari = new BigDecimal("1000000007");

        BigDecimal tenBeki =  ten.pow(input);
        BigDecimal nineBeki =  nine.pow(input).multiply(new BigDecimal(2));
        BigDecimal eightBeki =  eight.pow(input);

        BigDecimal answer = tenBeki.subtract(nineBeki).add(eightBeki);
        answer = answer.remainder(wari);
        System.out.println(answer);
    }
}
