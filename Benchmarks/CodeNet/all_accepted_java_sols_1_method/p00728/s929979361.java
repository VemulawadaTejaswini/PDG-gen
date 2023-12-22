import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int max;
        int maxNum = 0;
        int minNum = 0;
        int min;
        int sum;
        List<Integer> list = new ArrayList<Integer>();

        while (true) {
            n = sc.nextInt();
            max = -1;
            min = 1001;
            sum = 0;

            //入力終了
            if (n == 0) {
                break;
            }

            int[] nums = new int[n];

            //得点入力
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if (max <= nums[i]) {
                    max = nums[i];
                    maxNum = i;
                }
                if (nums[i] <= min) {
                    min = nums[i];
                    minNum = i;
                }
            }

            //最高得点と最低得点を0に
            nums[maxNum] = 0;
            nums[minNum] = 0;

            for (int num : nums) {
                sum += num;
            }

            list.add(sum / (n - 2));
        }
        for (int num : list) {
            System.out.println(num);
        }
        sc.close();
    }

}

