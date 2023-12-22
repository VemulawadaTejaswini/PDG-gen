import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        while (sc.hasNext()) {
            String[] S = sc.next().split("");

            int[] nums = new int[S.length];

            for (int i = 0; i < S.length; i++) nums[i] = map.get(S[i]);

            int sum = 0;
            for (int i = 0; i < S.length - 1; i++) sum = (nums[i] < nums[i + 1])? sum - nums[i] : sum + nums[i];

            sum += nums[nums.length - 1];
            System.out.println(sum);
        }
    }
}