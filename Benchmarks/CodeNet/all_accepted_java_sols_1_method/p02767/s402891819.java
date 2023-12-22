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
        String arr02[] = mylist.get(1).split(" ");

        int n = Integer.valueOf(arr01[0]);

        int mindata = Integer.MAX_VALUE;

        for (int p = 0; p <= 100; p++) {

            int mysum = 0;

            for (int j = 0; j < n; j++) {

                int temp = Integer.valueOf(arr02[j]);

                mysum += Math.pow((temp - p), 2);

                //                System.out.println(p + " " + temp + " " + mysum);

            }

            mindata = Math.min(mindata, mysum);

        }
        System.out.println(mindata);

    }
}
