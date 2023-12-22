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

        for (int i = 0; i < n - 2; i++) {
            int temp1 = Integer.valueOf(arr02[i]);
            int temp2 = Integer.valueOf(arr02[i + 1]);
            int temp3 = Integer.valueOf(arr02[i + 2]);

            if (temp1 < temp2) {
                temp2 -= 1;
                arr02[i + 1] = String.valueOf(temp2);

                if (temp2 > temp3) {
                    chkflg = false;
                    break;

                }

            } else if (temp1 == temp2) {
                if (temp2 > temp3) {
                    chkflg = false;
                    break;
                }
            } else {
                chkflg = false;
                break;
            }
        }

        System.out.println(chkflg ? "Yes" : "No");

    }

}
