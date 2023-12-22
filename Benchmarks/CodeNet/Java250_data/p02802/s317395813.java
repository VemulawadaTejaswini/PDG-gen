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
        int m = Integer.valueOf(arr01[1]);

        ArrayList<Integer> list02 = new ArrayList<Integer>();
        ArrayList<Integer> list03 = new ArrayList<Integer>();

        for (int j = 1; j <= n; j++) {
            list02.add(0);
            list03.add(0);

        }

        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");
            int p = Integer.valueOf(arr_temp[0]);
            String s = arr_temp[1];

            if (s.equals("AC") && list02.get(p - 1) == 0) {
                list02.set(p - 1, 1);
            }
            if (s.equals("WA") && list02.get(p - 1) == 0) {
                int val = list03.get(p - 1);
                list03.set(p - 1, val + 1);
            }

        }

        int mysum1 = 0;
        int mysum2 = 0;

        for (int k = 1; k <= n; k++) {

            if (list02.get(k - 1) >= 1) {
                mysum1 += 1;
                mysum2 += list03.get(k - 1);

            }
        }

        //        int mysum1 = list02.stream()
        //                .mapToInt(x -> x)
        //                .sum();
        //        int mysum2 = list03.stream()
        //                .mapToInt(x -> x)
        //                .sum();

        System.out.println(mysum1 + " " + mysum2);

    }

}
