import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = new int[T];
        for (int i = 0; i < T; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(IntStream.of(a).reduce(0,(right,left) -> right + left -1));
    }
}
