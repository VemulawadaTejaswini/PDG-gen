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

        int a = Integer.valueOf(arr01[0]);
        int b = Integer.valueOf(arr01[1]);
        int m = Integer.valueOf(arr01[2]);

        int arr02[] = new int[a];
        int arr03[] = new int[b];

        int j = 0;
        for (String x : mylist.get(1).split(" ")) {
            arr02[j] = Integer.valueOf(x);
            j += 1;
        }

        j = 0;
        for (String x : mylist.get(2).split(" ")) {
            arr03[j] = Integer.valueOf(x);
            j += 1;
        }

        //        //配列一覧出力
        //        System.out.println(Arrays.toString(arr02));
        //        System.out.println(Arrays.toString(arr03));

        int mindata = Integer.MAX_VALUE;
        for (int i = 3; i < 3 + m; i++) {

            int temp = 0;
            String arr_temp[] = mylist.get(i).split(" ");

            int x = Integer.valueOf(arr_temp[0]);
            int y = Integer.valueOf(arr_temp[1]);
            int c = Integer.valueOf(arr_temp[2]);

            temp = arr02[x - 1] + arr03[y - 1] - c;
            mindata = Math.min(mindata, temp);

        }

        //        System.out.println(mindata);
        Arrays.sort(arr02);
        Arrays.sort(arr03);

        mindata = Math.min(mindata, arr02[0] + arr03[0]);
        System.out.println(mindata);

    }

}
