import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double k = sc.nextInt();
        int times = (int) Math.ceil((n - k) / (k - 1));
        System.out.println(times + 1);
    }
}
