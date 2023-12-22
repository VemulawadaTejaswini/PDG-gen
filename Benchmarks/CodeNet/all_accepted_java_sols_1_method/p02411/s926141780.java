import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            List<Integer> list = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int m = list.get(0);
            int f = list.get(1);
            int r = list.get(2);

            if (m == -1 && f == -1 && r == -1) {
                break;
            }

            if (m == -1 || f == -1) {
                System.out.println("F");
                continue;
            }

            if (m + f >= 80) {
                System.out.println("A");
                continue;
            }

            if (m + f >= 65) {
                System.out.println("B");
                continue;
            }

            if (m + f >= 50) {
                System.out.println("C");
                continue;
            }

            if (m + f >= 30) {
                if (r >= 50) {
                    System.out.println("C");
                } else {
                    System.out.println("D");
                }
                continue;
            }

            System.out.println("F");
        }
    }
}