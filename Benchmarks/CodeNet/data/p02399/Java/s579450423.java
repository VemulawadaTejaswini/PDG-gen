import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
     int d = a / b;
     int r = a % b;
     double f = (double)a / b;
        System.out.printf("%d %d %f",d,r,f);
     }
}