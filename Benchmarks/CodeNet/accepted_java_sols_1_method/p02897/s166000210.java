import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double ans = Math.ceil(N/2) / N;
        System.out.println(ans);
    }
}
