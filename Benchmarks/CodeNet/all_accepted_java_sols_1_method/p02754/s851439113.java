import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long result = ((N / (A + B)) * A) + Math.min(N % (A + B), A);

        System.out.println(result);
    }
}