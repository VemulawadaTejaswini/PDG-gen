import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        List<Long> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nums.add(in.nextLong());
        }

        long smallest = Collections.min(nums);
        System.out.println(((n + smallest - 1) / smallest) + 4);
    }
}
