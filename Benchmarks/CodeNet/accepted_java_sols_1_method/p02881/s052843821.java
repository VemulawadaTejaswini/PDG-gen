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
        long n = Long.valueOf(arr01[0]);

        long i = 1;
        long j = n;

        double temp = Math.sqrt(n);
        //        System.out.println((int) temp);

        for (int k = 2; k <= (int) temp; k++) {
            if (n % k == 0) {
                i = k;
                j = n / i;
            }
        }
        //        System.out.println(i + " " + j);
        System.out.println((i - 1) + (j - 1));
    }

}
