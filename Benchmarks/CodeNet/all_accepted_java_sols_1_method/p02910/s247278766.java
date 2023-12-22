import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

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

        //        System.out.println(s);

        Boolean chkflg = true;

        for (int i = 0; i < s.length(); i++) {
            String stemp = s.substring(i, i + 1);
            //            System.out.println(stemp);
            if (i % 2 != 0) {

                if (stemp.equals("R")) {
                    chkflg = false;
                    break;
                }

            } else {

                if (stemp.equals("L")) {
                    chkflg = false;
                    break;
                }

            }

        }

        System.out.println(chkflg ? "Yes" : "No");

    }

}