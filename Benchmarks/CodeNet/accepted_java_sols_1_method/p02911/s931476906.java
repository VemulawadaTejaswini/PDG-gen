import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        String arr01[] = mylist.get(0).split(" ");
        int n = Integer.valueOf(arr01[0]);
        int k = Integer.valueOf(arr01[1]);
        int q = Integer.valueOf(arr01[2]);

        Integer arr_point[] = new Integer[n];

        //配列の全要素に初期値セット
        Arrays.fill(arr_point, 0);

        for (int i = 1; i < 1 + q; i++) {
            String arr_temp[] = mylist.get(i).split(" ");
            int a = Integer.valueOf(arr_temp[0]);
            //            System.out.println(a);
            arr_point[a - 1] += 1;
        }

        for (int j = 0; j < n; j++) {
            if (q - k + 1 <= arr_point[j]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        //        Arrays.stream(arr_point).forEach(s -> System.out.println(s));

    }

}
