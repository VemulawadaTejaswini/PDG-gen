import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        ArrayList<Long> A = new ArrayList<>();
        long xor = 0;
        for (var i = 0; i < N; i++) {
            long a = sc.nextLong();
            A.add(a);
            xor = xor ^ a;
        }
        for (var i = 0; i < N; i++)
            System.out.printf("%d ",xor ^ A.get(i));
    }
}