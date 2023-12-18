import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        long a = Long.parseLong(nums[0]);
        long b = Long.parseLong(nums[1]);
        System.out.println((a / b) + " " + (a % b) + " " + String.format("%f", ((double) a / b)));
    }
}