import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        sc.close();

        long hyakubaiB = (long) (Math.round(B * 100));

        System.out.println((A * hyakubaiB) / 100);
    }
}
