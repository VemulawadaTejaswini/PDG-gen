import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = nums[0];
        int b = nums[1];
        int t = nums[2];

        int cnt = t / a;
        System.out.println(cnt * b);
    }
}
