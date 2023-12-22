import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        int children = 0;
        for (int i = 0; i < n; i++) {
            x -= aArr[i];
            if (x < 0) break; // 子供がもらう飴の数の方が多い場合

            children++;
        }

        System.out.println(x > 0 ? children-1 : children);// 配る飴の数が余っている場合は最後の子供に全て渡す
    }
}
