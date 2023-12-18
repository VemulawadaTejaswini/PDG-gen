import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String V = scan.nextLine();
        String C = scan.nextLine();
        final List<Integer> v = Arrays.stream(V.split(" ")).mapToInt(Integer::parseInt).boxed().collect(
                Collectors.toList());
        final List<Integer> c = Arrays.stream(C.split(" ")).mapToInt(Integer::parseInt).boxed().collect(
                Collectors.toList());
        int max = 0;
        for (int i = 0; i < N; i++) {
            int n = v.get(i) - c.get(i);
            if (n > 0) {
                max += n;
            }
        }
        System.out.println(max);
    }
}
