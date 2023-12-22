import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        /*
         * 配列に出現した数をsetに格納する
         * setに存在するならその時のiを算出してreturn
         * */

        int[] arr = new int[1000000];
        arr[0] = s;
        Set<Integer> set = new HashSet<>();
        set.add(s);

        for (int i = 1; i < 1000000000; i++) {
            if (arr[i - 1] % 2 == 0) {
                arr[i] = arr[i - 1] / 2;
            } else {
                arr[i] = arr[i - 1] * 3 + 1;
            }

            if (set.contains(arr[i])) {
                System.out.println(i + 1);
                return;
            } else {
                set.add(arr[i]);
            }

        }

    }
}


