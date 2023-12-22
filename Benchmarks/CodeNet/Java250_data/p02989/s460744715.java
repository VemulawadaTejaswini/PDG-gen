import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        // 中央の要素の小さい側 + 1
        int idx = n / 2 - 1;
        int center = array[idx] + 1;
        idx++;
        int cnt = 0;
        while (true) {
            if (array[idx] >= center) {
                cnt++;
            } else {
                break;
            }
            center++;
        }
        System.out.println(cnt);
    }
}
