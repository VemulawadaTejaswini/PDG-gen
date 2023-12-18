import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data;
        long[] nums = new long[2];
        long tmp = 0;
        try {
            data = br.readLine().split(" ");
            for (int i = 0; i < 2; i++)
                nums[i] = Integer.parseInt(data[i]);

            while (nums[0] != 0) {
                if (nums[0] < nums[1]) {
                    tmp = nums[0];
                    nums[0] = nums[1];
                    nums[1] = tmp;
                }
                nums[0] -= nums[1];
            }
            System.out.println(nums[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
