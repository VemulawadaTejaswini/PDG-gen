import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        ArrayList<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {
            mylist.add(strinput);
            strinput = reader.readLine();
        }

        String s = mylist.get(0);
        String t = mylist.get(1);

        // 正規表現パターン指定
        Pattern p1 = Pattern.compile(s + "[a-z]");
        Matcher m1 = p1.matcher(t);
        System.out.println(m1.find() ? "Yes" : "No");

    }

}
