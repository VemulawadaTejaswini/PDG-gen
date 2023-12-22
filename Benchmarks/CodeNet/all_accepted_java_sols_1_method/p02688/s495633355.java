import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
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

        int n = Integer.valueOf(mylist.get(0).split(" ")[0]);
        int k = Integer.valueOf(mylist.get(0).split(" ")[1]);

        HashSet<String> hs = new HashSet<String>();
        int cnt = 0;
        while (cnt < k) {
            String arr_temp[] = mylist.get((cnt + 1) * 2).split(" ");
            for (String v : arr_temp) {
                hs.add(v);
            }
            cnt += 1;

        }
        System.out.println(n - hs.size());

    }

}
