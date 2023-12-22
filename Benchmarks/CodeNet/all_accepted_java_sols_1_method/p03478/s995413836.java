import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sumDigits = 0;
            String[] iStr = Integer.valueOf(i).toString().split("");
            for (int j=0; j < iStr.length; j++) {
                sumDigits += Integer.valueOf(iStr[j]);
            }

            if (a <= sumDigits && sumDigits <= b) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
