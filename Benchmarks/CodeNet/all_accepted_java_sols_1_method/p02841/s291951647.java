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

        int m1 = Integer.valueOf(arr01[0]);
        int d1 = Integer.valueOf(arr01[1]);
        int m2 = Integer.valueOf(arr02[0]);
        int d2 = Integer.valueOf(arr02[1]);

        Boolean chkflg = false;
        switch (m1) {
        case 1:
            if (d1 == 31) {
                chkflg = true;
            }
            break;
        case 2:
            if (d1 == 28) {
                chkflg = true;

            }
            break;
        case 3:
            if (d1 == 31) {
                chkflg = true;

            }
            break;
        case 4:

            if (d1 == 30) {
                chkflg = true;

            }
            break;
        case 5:
            if (d1 == 31) {
                chkflg = true;

            }
            break;
        case 6:
            if (d1 == 30) {
                chkflg = true;

            }
            break;
        case 7:
            if (d1 == 31) {
                chkflg = true;

            }
            break;
        case 8:
            if (d1 == 31) {
                chkflg = true;

            }
            break;
        case 9:
            if (d1 == 30) {
                chkflg = true;

            }
            break;
        case 10:
            if (d1 == 31) {
                chkflg = true;

            }
            break;
        case 11:
            if (d1 == 30) {
                chkflg = true;

            }
            break;
        case 12:
            if (d1 == 31) {
                chkflg = true;

            }
            break;
        }

        if (chkflg) {
            System.out.println("1");
        } else {
            System.out.println("0");

        }

    }

}
