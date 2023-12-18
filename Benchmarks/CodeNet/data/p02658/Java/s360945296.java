import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];
        int i = 0;
        while (sc.hasNext()) {
            A[i] = sc.nextLong();
            i++;
        }
        LongStream stream = LongStream.of(A);
        OptionalLong multiple = stream.reduce((a, b) -> a * b);
        String multipleTest;
        Long mt;
        if (1000000000 < multiple.getAsLong()) {
            multipleTest = Long.toString(multiple.getAsLong()).substring(0,11);
            mt = Long.parseLong(multipleTest);
            if (100000000 < mt) {
                System.out.println(-1);
            } else {
                System.out.println(multiple.getAsLong());
            }
        } else {
            System.out.println(multiple.getAsLong());
        }
    }
}
