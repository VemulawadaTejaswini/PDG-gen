import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pArr = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            pArr[i] = sc.nextInt();
            max = Math.max(max, pArr[i]);
        }

        int sum = 0;
        boolean flg = false;// 1つだけ半額にする管理フラグ
        for (int i = 0; i < n; i++) {
            if (max == pArr[i] && !flg) {
                sum += pArr[i]/2;
                flg = true;
            } else {
                sum += pArr[i];
            }
        }

        System.out.println(sum);
    }
}
