import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int[] nums = new int[n + 1];
        while (true) {
            if (i*i > n) { break; }
            int j = 1;
            while (true) {
                if ( i*i + j*j + i*j > n) { break; }
                int k = 1;
                while (true) {
                    int f = i*i + j*j + k*k + i*j + j*k + i*k;
                    if (f > n) {
                        break;
                    }
                    nums[f]++;
                    k++;
                }
                j++;
            }
            i++;
        }
        for (int idx = 1; idx <= n; idx++) {
            System.out.println(nums[idx]);
        }
    }
}
