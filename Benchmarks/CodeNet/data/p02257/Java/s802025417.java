import java.util.Scanner;
import java.lang.Math;

public class Main{

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int len = input1.nextInt();
        int total = 0;
        int num;
        int sqrted;
        boolean isPrime;

        for (int i = 0; i < len; i++) {
            num = input1.nextInt();
            isPrime = true;
            sqrted =(int) Math.sqrt(num);

            for (int j = 2; j <= sqrted; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                total++;
            }
        }
        System.out.println(total);
    }
}

