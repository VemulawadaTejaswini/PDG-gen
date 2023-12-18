import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            int sumOfDigit = 0;
            int number = i;

            do {
                int rmd = number % 10;
                sumOfDigit += rmd;
            } while ((number /= 10) != 0);

            if (sumOfDigit >= a && sumOfDigit <= b){
                ans += i;
            }
        }


        System.out.println(ans);
    }

}
