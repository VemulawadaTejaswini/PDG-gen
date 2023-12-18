import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        StringBuilder builder = new StringBuilder();
        StringTokenizer to;
        int[] nums = new int[3];
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a; i++) {
            to = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 3; j++) {
                nums[j] = Integer.parseInt(to.nextToken());
            }
            Arrays.sort(nums);
            if (Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(
                    nums[2], 2))
                builder.append("YES\n");
            else
                builder.append("NO\n");
        }
        System.out.print(builder);

    }
}