import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
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

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);

        for (int i = 0; i < 3; i++) {

            String arr01[] = mylist.get(i).split(" ");

            int a = Integer.valueOf(arr01[0]);
            int b = Integer.valueOf(arr01[1]);

            map.put(a, map.get(a) + 1);
            map.put(b, map.get(b) + 1);

        }

        List<Integer> list01 = new ArrayList<>(map.values());

        int maxdata = list01.stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);

        int mindata = list01.stream()
                .mapToInt(x -> x)
                .min()
                .orElse(0);

        //        System.out.println(maxdata + " " + mindata);

        if (maxdata == 2 && mindata == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
