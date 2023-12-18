import java.util.Scanner;

/**
 * Created by kazuki on 2014/06/26.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m, yen10, yen50, yen100, yen500, sum, calc;
        int num10, num50, num100, num500;

        m = s.nextInt();
        while (true) {
            yen10 = s.nextInt();
            yen50 = s.nextInt();
            yen100 = s.nextInt();
            yen500 = s.nextInt();
            sum = yen10 * 10 + yen50 * 50 + yen100 * 100 + yen500 * 500;

            calc = sum - m;

            num500 = yen500 - calc / 500;
            calc = calc % 500;
            num100 = yen100 - calc / 100;
            calc = calc % 100;
            num50 = yen50 - calc / 50;
            calc = calc % 50;
            num10 = yen10 - calc / 10;


            if (num10 > 0) System.out.println("10 " + num10);
            if (num50 > 0) System.out.println("50 " + num50);
            if (num100 > 0) System.out.println("100 " + num100);
            if (num500 > 0) System.out.println("500 " + num500);

            m = s.nextInt();
            if(m==0) break;
            System.out.println();
        }
    }
}