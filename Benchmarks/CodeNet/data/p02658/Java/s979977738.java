import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;

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
        Long mt;
        if (1000000000000000000L < multiple.getAsLong()) {
                System.out.println(-1);
            
        } else {
            System.out.println(multiple.getAsLong());
        }
    }
}
