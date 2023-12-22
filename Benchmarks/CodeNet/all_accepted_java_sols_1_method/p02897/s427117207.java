import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(N % 2 == 0 ? 0.5 : (float) (N / 2 + 1) / N);

    }
}



