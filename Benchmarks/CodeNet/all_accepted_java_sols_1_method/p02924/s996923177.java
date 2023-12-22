import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        long sum;
        sum = n * (n - 1) / 2;
        System.out.println(sum);
    }
}