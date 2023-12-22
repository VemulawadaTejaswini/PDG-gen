import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if (k < a) {
            System.out.println(String.format("%d %d",a-k,b));
        } else if (k <= a+b) {
            long c = b - (k-a);
            System.out.println(String.format("0 %d",c));
        } else {
            System.out.println("0 0");
        }
    }
}