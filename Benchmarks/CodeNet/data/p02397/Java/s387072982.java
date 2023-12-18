import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        while (true) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            if (a == 0 && b == 0) break;
            else if (a > b) System.out.println(b + " " + a);
            else System.out.println(a + " " + b);
        }
    }
}