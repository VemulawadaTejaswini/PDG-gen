import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.printf("%d %d %.5f%n",a / b, a % b, (double)a / (double)b);
    }

}