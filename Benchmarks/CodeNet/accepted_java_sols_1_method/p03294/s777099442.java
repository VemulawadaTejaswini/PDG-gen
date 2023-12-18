import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k[] = new int[n];
        int c = 0;
        for (int i = 0;i < n;++i){
            k[i] = sc.nextInt();
            c += k[i] - 1;
        }
        System.out.println(c);
    }
}
