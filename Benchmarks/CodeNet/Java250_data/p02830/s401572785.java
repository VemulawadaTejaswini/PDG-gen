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

        int n = Integer.valueOf(mylist.get(0));
        String arr_temp[] = mylist.get(1).split(" ");
        StringBuilder sb = new StringBuilder();
        String s = arr_temp[0];
        String t = arr_temp[1];

        for (int i = 0; i < n; i++) {
            sb.append(s.substring(i, i + 1));
            sb.append(t.substring(i, i + 1));

        }

        System.out.println(sb);
    }

}
