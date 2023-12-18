import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int w[] = new int[c];
        IntStream.range(0, c).forEach(i -> w[i] = sc.nextInt());

        OptionalInt r = IntStream.range(1, c).map(i -> {
            int s1 = Arrays.stream(w).limit(i).sum();
            int s2 = Arrays.stream(w).skip(i).sum();
            return Math.abs(s1 - s2);
        }).min();

        System.out.println(r.getAsInt());
    }
}
