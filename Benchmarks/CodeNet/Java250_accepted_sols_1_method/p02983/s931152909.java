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

        int l = Integer.valueOf(arr01[0]);
        int r = Integer.valueOf(arr01[1]);

        //        int l = 2022;
        //        int r = l + 2019;
        int mindata = 9999;

        int cnt = 0;
        int num = Math.min(2019, r - l - 1);

        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {

                int amari1 = i % 2019;
                int amari2 = j % 2019;
                int amari3 = (amari1 * amari2) % 2019;
                mindata = Math.min(mindata, amari3);

                //                System.out.println(i + " " + j + " " + amari3 + " " + mindata);
                if (mindata == 0) {
                    System.out.println(mindata);
                    return;
                }

            }
        }
        System.out.println(mindata);

    }

}
