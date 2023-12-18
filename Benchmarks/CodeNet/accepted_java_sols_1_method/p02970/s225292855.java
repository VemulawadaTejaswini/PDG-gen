import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), D = in.nextInt() * 2 + 1;
        System.out.println(N / D + (N % D == 0 ? 0 : 1));
    }
}