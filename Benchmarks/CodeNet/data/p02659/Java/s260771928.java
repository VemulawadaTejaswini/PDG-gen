import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        int b = (int)(Double.parseDouble(sc.next()) * 100);
        System.out.println(a * b / 100);
    }
}