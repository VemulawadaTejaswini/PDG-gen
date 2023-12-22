import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;
        for (int i = 0; i < N; i++) {
            long n = sc.nextLong();
            while (n % 2 == 0) {
                n /= 2;
                c++;
            }
        }
        System.out.println(c);
    }
}
