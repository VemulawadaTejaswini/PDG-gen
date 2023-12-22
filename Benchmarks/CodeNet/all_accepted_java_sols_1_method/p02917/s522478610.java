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
        int n = Integer.valueOf(arr01[0]);
        String arr02[] = mylist.get(1).split(" ");

        int mysum = Integer.valueOf(arr02[0]) + Integer.valueOf(arr02[n - 1 - 1]);

        for (int i = 0; i < n - 1 - 1; i++) {
            mysum += Math.min(Integer.valueOf(arr02[i]), Integer.valueOf(arr02[i + 1]));
        }
        System.out.println(mysum);

    }

}
