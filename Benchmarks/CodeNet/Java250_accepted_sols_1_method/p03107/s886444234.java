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
        String s = arr01[0];
        int l = s.length();

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < l; i++) {
            if (s.substring(i, i + 1).equals("0")) {
                cnt1 += 1;
            } else {
                cnt2 += 1;
            }
        }

        System.out.println(l - Math.abs(cnt1 - cnt2));

    }

}
