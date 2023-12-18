import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N == 0) {
            System.out.println(2);
            return;
        }
        if (N == 1){
            System.out.println(1);
            return;
        }
        long l0 = 2;
        long l1 = 1;
        for (int i = 1; i < N; i++) {
            long l2 = l0 + l1;
            l0 = l1;
            l1 = l2;
        }
        System.out.println(l1);
    }
}
