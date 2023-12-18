import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long r = (n-1) * n / 2;
        System.out.println(r);
    }
}
