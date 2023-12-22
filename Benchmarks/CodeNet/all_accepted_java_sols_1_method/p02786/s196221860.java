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

        long h = Long.valueOf(arr01[0]);

        if (h == 1) {
            System.out.println(1);
        } else {

            long cnt = 0;

            long temp = 1;

            long mysum = 0;

            while (h / 2 >= 2) {

                h = h / 2;
                cnt += 1;

                mysum += temp;

                temp *= 2;

            }

            double ans = mysum + Math.pow(2, cnt) * 3;

            //            System.out.println(ans);
            System.out.println((long) ans);
        }

    }
}
