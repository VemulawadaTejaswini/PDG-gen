import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int num;
        int max, min, sum;
        max = min = sum = Integer.parseInt(nums[0]);
        for (int i = 1; i < n; i++) {
            num = Integer.parseInt(nums[i]);
            if (max < num) max = num;
            else if (min > num) min = num;
            sum += num;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}