import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

        String arr01[] = mylist.get(0).split(" ");

        String n = arr01[0];

        switch (n.substring(n.length() - 1)) {
        case "0":
        case "1":
        case "6":
        case "8":
            System.out.println("pon");
            break;
        case "2":
        case "4":
        case "5":
        case "7":
        case "9":

            System.out.println("hon");
            break;

        default:

            System.out.println("bon");
            break;
        }
    }

}
