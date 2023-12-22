import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * abc173-B https://atcoder.jp/contests/abc173/tasks/abc173_b
 * 
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int cases = Integer.parseInt(reader.readLine());
            int ac = 0;
            int wa = 0;
            int tle = 0;
            int re = 0;
            while (cases-- > 0) {
                String input = reader.readLine();
                switch (input) {
                    case "AC":
                        ac++;
                        break;
                    case "WA":
                        wa++;
                        break;
                    case "TLE":
                        tle++;
                        break;
                    case "RE":
                        re++;
                        break;

                }
            }
            System.out.println("AC x " + ac);
            System.out.println("WA x " + wa);
            System.out.println("TLE x " + tle);
            System.out.println("RE x " + re);

        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}