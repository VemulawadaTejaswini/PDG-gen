import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() , b = scan.nextInt();

        int d = a / b;
        int r = a % b;

        String f = String.format("%.5f", ((double)a / (double)b);
        System.out.println(d + " " + r + " " + f);
    }
}