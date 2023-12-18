import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];
        int i = 0;
        long ans = 1;
        while (sc.hasNext()) {
            A[i] = sc.nextLong();
            if(A[i] == 0) ans = 0;
            i++;
        }
        LongStream stream = LongStream.of(A);
        OptionalLong multiple = stream.reduce((a, b) -> a * b);
        if (1000000000000000000L < multiple.getAsLong()) {
                ans = -1;
        } else if(ans != 0) {
            ans = multiple.getAsLong();
        }
        System.out.println(ans);
    }
}
