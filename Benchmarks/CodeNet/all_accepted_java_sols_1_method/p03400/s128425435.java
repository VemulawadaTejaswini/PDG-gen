import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> a.add(sc.nextInt()));

        int sum = 0;
        for (int i = 1; i <= d; i++) {
            for (int j = 0; j < n; j++) {
                if (a.get(j) == 1 || i % a.get(j) == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum + x);
    }


}
