import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[]{105,135,165,189,195};
        int n = scanner.nextInt();
        int k = 0;
        for (int b:a){
            if(b <= n)++k;
        }
        System.out.println(k);
    }

}
