import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        long hundB = (long)(100*B);

        System.out.println((A*hundB)/100);
    }
}