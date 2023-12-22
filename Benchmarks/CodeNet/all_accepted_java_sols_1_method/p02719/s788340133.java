import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();
        ArrayList<Long> already = new ArrayList<>();
        long minAnswer = N;
        minAnswer = Math.min(N%K, Math.abs(N%K-K));
        System.out.println(minAnswer);
    }
}
