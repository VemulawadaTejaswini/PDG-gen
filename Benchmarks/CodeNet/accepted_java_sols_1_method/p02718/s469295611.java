import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        String[] split = str.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        split = br.readLine().split(" ");

        int total = 0;

        List<Integer> hyous = new ArrayList<>();
        for (String s : split) {
            int hyou = Integer.parseInt(s);
            total += hyou;
            hyous.add(hyou);
        }

        hyous.sort(Collections.reverseOrder());

        int ikichi = total / (4 * m);
        int amari = total % (4 * m);
        if(amari != 0) {
            ikichi++;
        }
        for (int i = 0; i < m; i++) {
            int hyou = hyous.get(i);
            if (hyou < ikichi) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}
