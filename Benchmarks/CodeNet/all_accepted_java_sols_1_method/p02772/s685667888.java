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
        Boolean chkflg = true;
        for (int i = 0; i < arr02.length; i++) {

            if (Integer.valueOf(arr02[i]) % 2 == 0
                    && (!(Integer.valueOf(arr02[i]) % 3 == 0 || Integer.valueOf(arr02[i]) % 5 == 0))) {
                chkflg = false;
                break;
            }

        }

        System.out.println(chkflg ? "APPROVED" : "DENIED");

    }
}
