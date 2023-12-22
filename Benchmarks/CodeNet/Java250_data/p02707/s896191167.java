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
        String arr02[] = mylist.get(1).split(" ");
        int n = Integer.valueOf(arr01[0]);

        String arr_result[] = new String[n];

        Arrays.fill(arr_result, "0");

        for (int i = n - 1; i >= 1; i--) {
            int a = Integer.valueOf(arr02[i - 1]);
            int val = Integer.valueOf(arr_result[a - 1]);
            arr_result[a - 1] = String.valueOf(val + 1);

            //            System.out.println(Arrays.toString(arr_result));
        }
        String result = String.join(System.getProperty("line.separator"), arr_result);

        System.out.println(result);
    }

}
