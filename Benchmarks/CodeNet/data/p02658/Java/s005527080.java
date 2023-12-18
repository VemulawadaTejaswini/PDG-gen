import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        BigDecimal ans = new BigDecimal("1");
        for (int i1 = 0; i1 < i; i1++) {
            ans = ans.multiply(new BigDecimal(scanner.next()));
        }
        if(ans.compareTo(new BigDecimal("1000000000000000000")) == 1){
            System.out.println(-1);
        }else{
            System.out.println(ans.toString());
        }
    }
}
