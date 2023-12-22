import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(Math.min(Math.abs(n-n/k*k), Math.abs(n-(n/k+1)*k)));
        return;
    }
}