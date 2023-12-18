import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

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

        TreeSet<String> hs = new TreeSet<String>();
        String s = mylist.get(0);
        int k = Integer.valueOf(mylist.get(1));

        int cnt = 1;

        while (cnt <= k) {
            int sposi = 0;
            while (sposi < s.length() - cnt + 1) {
                String stemp = s.substring(sposi, sposi + cnt);
                hs.add(stemp);
                //                System.out.println(stemp);
                sposi += 1;
            }
            cnt += 1;
        }

        int counter = 1;
        for (String v : hs) {
            if (counter == k) {
                System.out.println(v);
                break;
            }
            counter += 1;
            

        }

    }

}
