import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum, nums[];
        double asq, ave;
        while (true) {
            sum = 0; ave = .0; asq = .0;
            n = sc.nextInt();
            if (n == 0) break;
            nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                sum += nums[i];
            }
            ave = (double)sum / n;
            for (int i = 0; i < n; i++) {
                asq += Math.pow(Math.abs(nums[i] - ave), 2);
            }
            asq /= n;
            System.out.printf("%.8f\n", Math.sqrt(asq));
        }
    }
}