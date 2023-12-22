import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long remain = N % (A + B);
        if (remain>A) {
            remain=A;
        }
        long num= N / (A + B);

        System.out.println(num*A+remain);

        sc.close();

    }
}