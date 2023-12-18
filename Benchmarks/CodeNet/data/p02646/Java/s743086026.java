import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final long V = sc.nextLong();
        final long B = sc.nextLong();
        final long W = sc.nextLong();
        final long T = sc.nextLong();

        System.out.println(A+V*T >= B+W*T ? "YES" : "NO");
    }
}
