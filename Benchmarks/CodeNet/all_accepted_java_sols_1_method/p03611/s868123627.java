import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        // 主処理
        int max = a.stream().mapToInt(t -> t).max().getAsInt() + 1;
        int[] count = new int[max + 1];
        for (int num : a) {
            int minus1 = num - 1;
            int plus1 = num + 1;
            if (0 <= minus1) {
                count[minus1]++;
            }
            count[plus1]++;
            count[num]++;
        }
        int result = Arrays.stream(count).max().getAsInt();

        // 出力
        System.out.println(result);
        sc.close();
    }
}