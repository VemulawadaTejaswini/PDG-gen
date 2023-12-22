import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long tmp = 0;
        long comp = 0;
        for (long i = A; B >= i;) {
            i = i * 2;
            tmp++;
        }
        System.out.println(tmp);
    }
}