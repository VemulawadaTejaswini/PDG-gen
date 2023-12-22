import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        String[] arr = s.split("");
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        String result = "";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int j2 = 0; j2 < 2; j2++) {
                    int ans = nums[0];
                    ans = i == 0 ? ans + nums[1] : ans - nums[i];
                    ans = j == 0 ? ans + nums[2] : ans - nums[2];
                    ans = j2 == 0 ? ans + nums[3] : ans - nums[3];
                    if (ans == 7) {
                        String op1 = i == 0 ? "+" : "-";
                        String op2 = j == 0 ? "+" : "-";
                        String op3 = j2 == 0 ? "+" : "-";
                        result = nums[0] + op1 + nums[1] + op2 + nums[2] + op3 + nums[3] + "=7";
                        break;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
