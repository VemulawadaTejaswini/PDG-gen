import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. 1つ選んで1減らす or 2. 2つ増やすと同じ
        // 最小回数は出来るだけ、2を使うこと
        Arrays.sort(arr);

        int cnt = 0;

        // 2.
        cnt += (arr[2] - arr[0]) / 2;
        arr[0] += ((arr[2] - arr[0]) / 2) * 2;

        cnt += (arr[2] - arr[1]) / 2;
        arr[1] += ((arr[2] - arr[1]) / 2) * 2;

        // 1.
        // x - 1, x - 1 , x
        // x - 1, x     , x
        // x    , x     , x
        if (arr[0] == arr[1] && arr[1] != arr[2]) {
            cnt += 1;
        } else if (arr[0] != arr[1]) {
            cnt += 2;
        }

        out.println(cnt);
    }
}