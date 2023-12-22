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
        String u = mylist.get(2);

        String s = arr01[0];
        String t = arr01[1];

        int a = Integer.valueOf(arr02[0]);
        int b = Integer.valueOf(arr02[1]);

        if (u.equals(s)) {
            a -= 1;
        } else {
            b -= 1;
        }
        System.out.println(a + " " + b);
    }

}
