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

        int a = Integer.valueOf(arr01[0]);
        int b = Integer.valueOf(arr01[1]);
        int c = Integer.valueOf(arr01[2]);
        int k = Integer.valueOf(arr01[3]);

        if (a >= k) {
            System.out.println(k);
        } else if (a + b >= k) {
            System.out.println(a);
        } else {
            int nokori = k - (a + b);
            System.out.println(a - Math.min(c, nokori));

        }

    }

}
