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

        int k = Integer.valueOf(mylist.get(0));
        int a = Integer.valueOf(mylist.get(1).split(" ")[0]);
        int b = Integer.valueOf(mylist.get(1).split(" ")[1]);

        Boolean chkflg = false;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                chkflg = true;
                break;
            }
        }
        System.out.println(chkflg ? "OK" : "NG");

    }

}
