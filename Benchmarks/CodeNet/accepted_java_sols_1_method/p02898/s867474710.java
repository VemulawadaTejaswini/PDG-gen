import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> h = new ArrayList<>();

        IntStream.rangeClosed(1, N).forEach(i -> h.add(sc.nextInt()));
        sc.close();

        int answer = (int) h.stream()
                .filter(hi -> hi >= K)
                .count();

        System.out.println(answer);
    }
}