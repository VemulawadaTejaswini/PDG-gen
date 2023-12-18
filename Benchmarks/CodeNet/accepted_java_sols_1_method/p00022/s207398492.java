import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.next());

            if (n == 0)break;

            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums.add(Integer.parseInt(sc.next()));
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.size(); i++) {
                int sum = 0;
                for (int j = i; j < nums.size(); j++) {
                    sum += nums.get(j);
                    max = (sum > max)? sum : max;
                }
            }

            System.out.println(max);
        }
    }
}