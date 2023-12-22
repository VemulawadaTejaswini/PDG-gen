import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            //String str[] = br.readLine().split(" ");
            long n = Integer.parseInt(br.readLine());
            ArrayList<Long> a = new ArrayList<Long>();
            ArrayList<Long> b = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                String tmp[] = br.readLine().split(" ");
                a.add(Long.parseLong(tmp[0]));
                b.add(Long.parseLong(tmp[1]));
            }
            long count = 0;
            for (long i = n; i > 0; i--) {
                Long atmp = a.get((int) (i - 1));
                atmp = atmp + count;
                Long btmp = b.get((int) (i - 1));
                long tmp = (atmp) % btmp;
                if (tmp != 0) {
                    count = count + (btmp - tmp);
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}