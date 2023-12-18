import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        int m = Integer.valueOf(arr01[0]);
        int d = Integer.valueOf(arr01[1]);

        //        System.out.println(m + " " + d + " " + d1 + " " + d2);

        int cnt = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 22; j <= d; j++) {

                int d1 = Integer.valueOf(String.valueOf(j).substring(0, 1));
                int d2 = Integer.valueOf(String.valueOf(j).substring(1, 2));

                if (i == d1 * d2 && d2 > 1) {

//                    System.out.println(i + " " + j + " " + d1 + " " + d2);
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);

    }

}
