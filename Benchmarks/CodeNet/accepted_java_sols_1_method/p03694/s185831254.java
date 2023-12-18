import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        int max = Arrays.stream(a).boxed().max(Comparator.naturalOrder()).get();
        int min = Arrays.stream(a).boxed().min(Comparator.naturalOrder()).get();
        System.out.println(max - min);
    }

}
