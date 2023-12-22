import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long rem = N % (A + B);
        long result = (N - rem) / (A + B) * A;
        if (rem - A >= 0) {
            result += A;
        } else {
            result += rem;
        }
        System.out.println(result);
    }

}
