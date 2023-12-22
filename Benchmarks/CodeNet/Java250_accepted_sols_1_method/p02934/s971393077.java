import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Float[] b = new Float[a];
        float sum = 0;
        for (int i = 0; i < a; i++){
            b[i] = sc.nextFloat();
        }
        for (int i = 0; i < a; i++){
            sum = sum + (1/b[i]);
        }
        System.out.print(1/sum);
    }
}
