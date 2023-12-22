import java.math.BigDecimal;
import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());
        BigDecimal answer;

        answer = a.multiply(b);
        String answerStr = answer.toString();
        int ten = answerStr.lastIndexOf(".");
        
        if (ten == -1) {
            System.out.println(answerStr);
        } else {
            System.out.println(answerStr.substring(0, ten));
        }
    }
}