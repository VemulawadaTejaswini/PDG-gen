import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

        String arr01[] = mylist.get(0).split(" ");

        Integer n = Integer.valueOf(arr01[0]);

        List<String> list = new ArrayList<>();
        for (int i = 1; i < 1 + n; i++) {
            String temp = mylist.get(i);

            char[] c = temp.toCharArray();
            Arrays.sort(c);
            String str1 = new String(c);
            list.add(str1);

        }

        //昇順でソート
        //        Collections.sort(list);

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list.size(); i++) {

            if (map.containsKey(list.get(i))) {
                int val = map.get(list.get(i));
                map.put(list.get(i), val + 1);
            } else {
                map.put(list.get(i), 1);
            }

        }

        long mysum = 0;
        for (Integer v : map.values()) {
            long ans_temp = (long) v * (v - 1);
            mysum += ans_temp / 2;
        }

        System.out.println(mysum);

    }
}
