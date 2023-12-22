
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int c5 = sc.nextInt();
        int c6 = sc.nextInt();
        int c7 = sc.nextInt();
        int c8 = sc.nextInt();
        int c9 = sc.nextInt();
        int sum1 = c1 + c5 + c9;
        int sum2 = c1 + c6 + c8;
        int sum3 = c2 + c4 + c9;
        int sum4 = c2 + c6 + c7;
        int sum5 = c3 + c4 + c8;
        int sum6 = c3 + c5 + c7;
        if (sum1 == sum2 && sum2 == sum3 && sum3 == sum4 && sum4 == sum5 && sum5 == sum6) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}