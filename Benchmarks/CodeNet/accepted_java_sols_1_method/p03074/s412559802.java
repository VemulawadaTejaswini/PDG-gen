import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] c = sc.next().toCharArray();
        List<Integer> nums = new ArrayList<>();
        char now = '1';
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            if (c[i] == now) {
                count++;
            } else {
                nums.add(count);
                if (now == '0') {
                    now = '1';
                } else {
                    now = '0';
                }
                count = 1;
            }
        }
        nums.add(count);
        if (nums.size() % 2 == 0) {
            nums.add(0);
        }

        int[] a = new int[nums.size() + 1];
        int sum = 0;
        for (int i = 0 ; i < nums.size() ; i++) {
            sum += nums.get(i);
            a[i + 1] = sum;
        }

        int add = Math.min(nums.size(), 2 * k + 1);
        int max = 0;
        for (int i = 0 ; i < nums.size() + 1 ; i += 2) {
            if (i + add < nums.size() + 1) {
                max = Math.max(max, a[i + add] - a[i]);
            }
        }
        if (nums.size() == 1) {
            System.out.println(n);
        } else {
            System.out.println(max);
        }

    }

}
