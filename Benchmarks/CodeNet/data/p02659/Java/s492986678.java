import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        int bb = (int) (b * 100);
        System.out.println((a * b) / 100);
    }
}
