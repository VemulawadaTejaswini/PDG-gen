import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.valueOf(st.nextToken());
            int M = Integer.valueOf(st.nextToken());
            Map<String, String> map = new HashMap<String, String>();
            String[][] data = new String[M][2];
            String[] a = new String[M];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                String p = st.nextToken();
                String y = st.nextToken();

                String p0 = "000000" + p;
                String y0 = "000000000" + y;

                String tempp = p0.substring(p0.length() - 6, p0.length());
                String tempy = y0.substring(y0.length() - 10, y0.length());
                data[i][0] = tempp;
                data[i][1] = tempy;
                a[i] = tempp + "_" + tempy;
            }
            Arrays.sort(a);
            int index = 1;
            String t = a[0].split("_")[0];
            for (int i = 0; i < M; i++) {
                String[] temps = a[i].split("_");
                if (t.equals(temps[0])) {
                    map.put(a[i], "" + index);
                    index++;
                } else {
                    t = temps[0];
                    index = 1;
                    map.put(a[i], "" + index);
                    index++;
                }
            }
            for (int i = 0; i < M; i++) {
                String num = map.get(data[i][0] + "_" + data[i][1]);
                num = "000000000" + num;
                num = num.substring(num.length() - 6, num.length());
                System.out.println(data[i][0] + "" + num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}