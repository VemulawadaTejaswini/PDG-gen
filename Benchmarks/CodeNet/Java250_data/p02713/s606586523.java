import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=k; i++) {
            for (int j=1; j<=k; j++) {
                for (int l=1; l<=k; l++) {
                    sum += gcd(gcd(i, j), l);
                }
            }
        }

        System.out.println(sum);
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}
