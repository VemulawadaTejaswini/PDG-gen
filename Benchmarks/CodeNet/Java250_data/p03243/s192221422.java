import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N % 111 == 0){
            System.out.println(N);
            return;
        }
        int DN = N/111;
        System.out.println(111 * (DN + 1));
    }
}
