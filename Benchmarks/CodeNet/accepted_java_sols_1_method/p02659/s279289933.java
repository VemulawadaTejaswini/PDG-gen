import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        double b = Double.parseDouble(sc.next());
        long c = Math.round(b * 100);
        System.out.println(a * c / 100);
    }
}