import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<String> list01 = new ArrayList<String>(Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"));
        String arr01[] = mylist.get(0).split(" ");
        String s = arr01[0];

        System.out.println(list01.indexOf(s) == 0 ? 7 : 7 - list01.indexOf(s));

    }

}