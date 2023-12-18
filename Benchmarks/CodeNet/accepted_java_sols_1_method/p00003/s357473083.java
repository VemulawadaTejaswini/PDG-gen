import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data_num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < data_num; i++) {
            String[] line = sc.nextLine().split(" ");
            IntStream intLine = Arrays.stream(line)
                    .mapToInt(Integer::parseInt)
                    .sorted();
            int[] intAraay = intLine.toArray();
            int a = intAraay[0];
            int b = intAraay[1];
            int c = intAraay[2];
            if (c * c == a * a + b * b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}