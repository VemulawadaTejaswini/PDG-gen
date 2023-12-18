import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ints = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int ans = ints[2] - ints[0];
        System.out.println(ans);
    }
}