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
        double moto = 100;
        long x = Long.valueOf(mylist.get(0));
        int cnt = 0;
//        System.out.println(x);

        while (moto < x) {

            moto = Math.floor(moto * 1.01);
            cnt += 1;
        }
        System.out.println(cnt);

    }

}
